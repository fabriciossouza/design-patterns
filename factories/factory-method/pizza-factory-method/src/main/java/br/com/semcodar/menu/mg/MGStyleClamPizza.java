package br.com.semcodar.menu.mg;

import br.com.semcodar.pizza.Pizza;

public class MGStyleClamPizza extends Pizza {
	public MGStyleClamPizza() {
		name = "MG Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Frozen Clams from Chesapeake Bay");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
