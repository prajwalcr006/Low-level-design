package Decorator;

public class Main {
	public static void main(String args[]) {
		BasePizza pizza = new ExtraCheese(new Mashroom(new VeggieDelight()));
		
		System.out.println("Total cost is "+ pizza.cost());
	}
}
