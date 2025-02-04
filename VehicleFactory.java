package ParkingLot;

public class VehicleFactory {
	public Vehicle getVehicle(String type, int vehicleId, Ticket ticket) {
		Vehicle v = null;
		
		switch(type) {
		case "twoWheeler": v = new TwoWheelerVehicle(vehicleId, ticket);
		break;
		
		case "fourWheeler": v = new FourWheelerVehicle(vehicleId, ticket);
		break;
		
		default: System.out.println("Invalid type");
		}
		
		return v;
	}
}
