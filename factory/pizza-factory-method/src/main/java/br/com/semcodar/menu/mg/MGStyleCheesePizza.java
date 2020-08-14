package br.com.semcodar.menu.mg;

import br.com.semcodar.pizza.Pizza;

public class MGStyleCheesePizza extends Pizza {

	public MGStyleCheesePizza() {
		name = "MG Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
