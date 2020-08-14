package br.com.semcodar.menu.sp;

import br.com.semcodar.pizza.Pizza;
import br.com.semcodar.pizza.PizzaStore;

public class SPPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {

		if (item.equals("cheese")) {
			return new SPStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new SPStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new SPStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new SPStylePepperoniPizza();
		}

		return null;
	}
}
