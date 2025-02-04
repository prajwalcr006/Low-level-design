package ParkingLot;

public class FourWheelerParkingSpot extends ParkingSpot {

	FourWheelerParkingSpot(int id, boolean isOccupied, int distance) {
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
