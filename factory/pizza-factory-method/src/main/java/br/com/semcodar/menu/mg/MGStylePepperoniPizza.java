package br.com.semcodar.menu.mg;

import br.com.semcodar.pizza.Pizza;

import static java.lang.System.out;

public class MGStylePepperoniPizza extends Pizza {

	public MGStylePepperoniPizza() {
		name = "MG Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}

	@Override
	public void cut() {
		out.println("Cutting the pizza into square slices");
	}
}
