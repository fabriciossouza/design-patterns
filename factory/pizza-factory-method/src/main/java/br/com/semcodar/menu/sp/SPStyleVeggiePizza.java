package br.com.semcodar.menu.sp;

import br.com.semcodar.pizza.Pizza;

public class SPStyleVeggiePizza extends Pizza {

	public SPStyleVeggiePizza() {
		name = "SP Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
		toppings.add("Garlic");
		toppings.add("Onion");
		toppings.add("Mushrooms");
		toppings.add("Red Pepper");
	}
}
