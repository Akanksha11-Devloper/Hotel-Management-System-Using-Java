package hotel.model;


public class Room {
    private int roomNumber;
    private boolean isBooked;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false; 
    }

   
    public int getRoomNumber() {
        return roomNumber;
    }

    
    public boolean isBooked() {
        return isBooked;
    }

    
    public void bookRoom() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomNumber + " has been booked.");
        } else {
            System.out.println("Room " + roomNumber + " has already been booked.");
        }
    }

    
    public void cancelBooking() {
        if (isBooked) {
            isBooked = false;
            System.out.println("Booking of room " + roomNumber + " is cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " is not yet booked.");
        }
    }
}
