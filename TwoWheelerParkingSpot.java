package ParkingLot;

public class TwoWheelerParkingSpot extends ParkingSpot {

	TwoWheelerParkingSpot(int id, boolean isOccupied, int distance) {
		super(id, isOccupied, distance);
	}

	@Override
	public void bookSpot() {
		isOccupied = true;
		
	}

	@Override
	public void freeSpot() {
		isOccupied = false;
	}
	
	@Override
	public boolean getStatus() {
		return isOccupied;
	}
	
}
