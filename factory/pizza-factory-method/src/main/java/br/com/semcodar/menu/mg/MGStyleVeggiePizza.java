package br.com.semcodar.menu.mg;

import br.com.semcodar.pizza.Pizza;

import static java.lang.System.out;

public class MGStyleVeggiePizza extends Pizza {

	public MGStyleVeggiePizza() {
		name = "MG Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}

	@Override
	public void cut() {
		out.println("Cutting the pizza into square slices");
	}
}
