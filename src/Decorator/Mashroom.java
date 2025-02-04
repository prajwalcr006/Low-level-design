package Decorator;

public class Mashroom extends ToppingsDecorator {

	Mashroom(BasePizza pizza) {
		super(pizza);
	}
	
	@Override
	public int cost() {
		return pizza.cost() + 50;
	}
}
