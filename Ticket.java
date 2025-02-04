package ParkingLot;

public class Ticket {
	protected ParkingSpot spot;
	protected long entryTime;
	
	Ticket(ParkingSpot spot, long entryTime) {
		this.entryTime = entryTime;
		this.spot = spot;
	}
}
