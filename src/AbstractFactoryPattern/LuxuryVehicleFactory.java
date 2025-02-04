package AbstractFactoryPattern;

public class LuxuryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String type) {
		Vehicle v;
		switch(type.toLowerCase()) {
		case "mercedes": v = new Mercedes();
		break;
		
		case "RollsRoyce": v = new RollsRoyce(); 
		break;
		
		default: v = null;
		}
		
		return v;
	}

}
