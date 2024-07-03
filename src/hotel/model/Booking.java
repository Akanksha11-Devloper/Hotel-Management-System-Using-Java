package hotel.model;

public class Booking {
	private Room room;
	private String guestName;
	
	public Booking(Room room, String guestName) {
	
		this.room = room;
		this.guestName = guestName;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	
	
	
	
}
