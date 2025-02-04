package ParkingLot;

public class EntryGate1 implements EntryGate {

	@Override
	public Vehicle enterVehicle(String type, ParkingSpotStratergy s, int vehicleId) {
		Ticket ticket = generateTicket(type, s);
		Vehicle v = null;
		if(ticket != null) {
			VehicleFactory vf = new VehicleFactory();
			v = vf.getVehicle(type, vehicleId, ticket);
		}
		
		return v;
	}

	private Ticket generateTicket(String type, ParkingSpotStratergy s) {
		ParkingManagerFactory pmf = new ParkingManagerFactory();
		ParkingSpotManager manager = pmf.getParkingSpotManager(type);
		
		ParkingSpot spot = manager.getParkingSpot(s);
		Ticket ticket = null;
		
		if(spot != null) {
			manager.fillParkingSpot(spot);
			long entryTime = System.currentTimeMillis();
			ticket = new Ticket(spot,entryTime);
		}
		return ticket;
	}

}
