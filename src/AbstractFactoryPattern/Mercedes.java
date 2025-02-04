package AbstractFactoryPattern;

public class Mercedes implements Vehicle {

	@Override
	public int milage() {
		return 10;
	}

	@Override
	public int fuelCapacity() {
		return 40;
	}

	@Override
	public int totalKMonFullTank() {
		return milage() * fuelCapacity();
	}

}
