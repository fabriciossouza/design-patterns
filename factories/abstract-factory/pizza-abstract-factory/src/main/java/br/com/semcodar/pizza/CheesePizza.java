package br.com.semcodar.pizza;

import br.com.semcodar.pizza.ingredient.PizzaIngredientFactory;

import static java.lang.System.out;

public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}
}
