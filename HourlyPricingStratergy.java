package ParkingLot;

public class HourlyPricingStratergy implements PricingStratergy {
	
	private double cost = 10.0;
	public static final double MILLIS_TO_HOURS = (1000*60*60);

	@Override
	public double computeCost(Ticket ticket) {
		double entryTimeInMillis = ticket.entryTime;
		double exitTimeInMillis = System.currentTimeMillis();
		
		double totalHours = (exitTimeInMillis - entryTimeInMillis)/MILLIS_TO_HOURS;
		
		double bill = cost * totalHours;
		
		return bill;
	}
}
