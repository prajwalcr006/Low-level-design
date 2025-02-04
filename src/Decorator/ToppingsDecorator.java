package Decorator;

public abstract class ToppingsDecorator extends BasePizza {
	BasePizza pizza;
	
	ToppingsDecorator(BasePizza pizza) {
		this.pizza = pizza;
	} 
	
}
