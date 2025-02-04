package ParkingLot;

public class ExitGate1 implements ExitGate {

	@Override
	public double exitVehicle(Vehicle v) {
		PricingStratergy s = new HourlyPricingStratergy();
		ParkingManagerFactory pmf = new ParkingManagerFactory();
		
		String type = (v instanceof TwoWheelerVehicle) ? "twoWheeler" : "FourWheeler";
		
		ParkingSpotManager manager = pmf.getParkingSpotManager(type);
		double cost = s.computeCost(v.ticket);
		
		manager.freeParkingSpot(v.ticket.spot);
		
		return cost;
	}

}
