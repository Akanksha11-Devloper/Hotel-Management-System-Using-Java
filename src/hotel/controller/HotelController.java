package hotel.controller;

import java.util.ArrayList;
import java.util.List;

import hotel.model.Booking;
import hotel.model.Room;
import hotel.view.HotelView;

public class HotelController {
    private List<Room> rooms;
    private List<Booking> bookings;
    private HotelView view;

    public HotelController(HotelView view) {
        this.view = view;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(int roomNumber) {
        rooms.add(new Room(roomNumber));
        view.printMessage("Room " + roomNumber + " has been added.");
    }

    public void bookRoom(int roomNumber, String guestName) {
        Room room = findRoom(roomNumber);
        if (room != null) {
            if (!room.isBooked()) {
                room.bookRoom(); 
                Booking booking = new Booking(room, guestName);
                bookings.add(booking);
                view.printBookingDetails(booking);
            } else {
                view.printRoomAlreadyBooked(roomNumber);
            }
        } else {
            view.printRoomDoesNotExist(roomNumber);
        }
    }

	public void cancelBooking(int roomNumber) {
		Room room = findRoom(roomNumber);
		if (room != null) {
			if (room.isBooked()) {
				room.cancelBooking(); 
				Booking booking = findBooking(roomNumber);
				if (booking != null) {
					bookings.remove(booking);
				}
				view.printBookingCancelled(roomNumber);
			} else {
				view.printRoomNotBooked(roomNumber);
			}
		} else {
			view.printRoomDoesNotExist(roomNumber);
		}
	}

	private Room findRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

	private Booking findBooking(int roomNumber) {
	    for (Booking booking : bookings) {
	        if (booking.getRoom().getRoomNumber() == roomNumber) {
	            return booking;
	        }
	    }
	    return null;
	}
}
