package ParkingLot;

public abstract class ParkingSpot {
	protected int id;
	protected boolean isOccupied;
	protected int distance;
	
	ParkingSpot(int id, boolean isOccupied, int distance) {
		this.id = id;
		this.isOccupied = isOccupied;
		this.distance = distance;
	}
	
	public abstract void bookSpot();
	public abstract void freeSpot();
	public abstract boolean getStatus();
}
