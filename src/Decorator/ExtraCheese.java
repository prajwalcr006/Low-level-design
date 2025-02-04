package Decorator;

public class ExtraCheese extends ToppingsDecorator {
	
	ExtraCheese(BasePizza pizza) {
		super(pizza);
	}
	
	@Override
	public int cost() {
		return pizza.cost() + 30;
	}
}
