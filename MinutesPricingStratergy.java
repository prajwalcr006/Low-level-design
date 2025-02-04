package ParkingLot;

public class MinutesPricingStratergy implements PricingStratergy {

	private double cost = 1.0;
	public static final double MILLIS_TO_MINUTES = (10);

	@Override
	public double computeCost(Ticket ticket) {
		double entryTimeInMillis = ticket.entryTime;
		double exitTimeInMillis = System.currentTimeMillis();
		
		double totalMinutes = (exitTimeInMillis - entryTimeInMillis)/MILLIS_TO_MINUTES;
		
		double bill = cost * totalMinutes;
		
		return bill;
	}

}
