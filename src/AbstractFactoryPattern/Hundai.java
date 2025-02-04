package AbstractFactoryPattern;

public class Hundai implements Vehicle {

	@Override
	public int milage() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int fuelCapacity() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int totalKMonFullTank() {
		// TODO Auto-generated method stub
		return milage() * fuelCapacity();
	}

}
