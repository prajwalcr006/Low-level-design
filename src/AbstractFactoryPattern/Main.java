package AbstractFactoryPattern;

public class Main {
	public static void main(String args[]) {
		VehicleFactory f = new LuxuryVehicleFactory();
		
		Vehicle v = f.getVehicle("mercedes");
		
		System.out.println("mercedes has" + v.totalKMonFullTank() + " total range");
	}
}
