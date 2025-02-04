package ParkingLot;

public abstract class Vehicle {
	protected int vehicleId;
	protected Ticket ticket;
	
	Vehicle(int vehicleId, Ticket ticket) {
		this.ticket = ticket;
		this.vehicleId = vehicleId;
	}
}
