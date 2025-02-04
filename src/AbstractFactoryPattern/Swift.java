package AbstractFactoryPattern;

public class Swift implements Vehicle {

	@Override
	public int milage() {
		return 20;
	}

	@Override
	public int fuelCapacity() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int totalKMonFullTank() {
		return milage() * fuelCapacity();
	}

}
