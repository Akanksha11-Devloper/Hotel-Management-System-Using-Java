package hotel.view;

import hotel.model.Booking;
import hotel.model.Room;

import java.util.Scanner;

public class HotelView {

    private Scanner scanner;

    public HotelView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int promptForRoomNumberToAdd() {
        System.out.print("Enter room number to add: ");
        return scanner.nextInt();
    }

    public String promptForGuestName() {
        System.out.print("Enter guest name: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public int promptForRoomNumberToBook() {
        System.out.print("Enter room number to book: ");
        return scanner.nextInt();
    }

    public int promptForRoomNumberToCancelBooking() {
        System.out.print("Enter room number to cancel booking: ");
        return scanner.nextInt();
    }

    public void printRoomDetails(Room room) {
        System.out.println("Room Number: " + room.getRoomNumber() + ", Is Booked: " + room.isBooked());
    }

    public void printBookingDetails(Booking booking) {
        System.out.println("Room Number: " + booking.getRoom().getRoomNumber() + ", Guest Name: " + booking.getGuestName());
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printRoomBooked(int roomNumber) {
        System.out.println("Room " + roomNumber + " has been booked.");
    }

    public void printRoomAlreadyBooked(int roomNumber) {
        System.out.println("Room " + roomNumber + " has already been booked.");
    }

    public void printBookingCancelled(int roomNumber) {
        System.out.println("Booking of room " + roomNumber + " is cancelled.");
    }

    public void printRoomNotBooked(int roomNumber) {
        System.out.println("Room " + roomNumber + " is not yet booked.");
    }

    public void printRoomDoesNotExist(int roomNumber) {
        System.out.println("Room " + roomNumber + " does not exist.");
    }
}
