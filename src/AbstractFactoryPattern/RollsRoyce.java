package AbstractFactoryPattern;

public class RollsRoyce implements Vehicle {

	@Override
	public int milage() {
		return 20;
	}

	@Override
	public int fuelCapacity() {
		return 50;
	}

	@Override
	public int totalKMonFullTank() {
		return milage() * fuelCapacity();
	}

}
