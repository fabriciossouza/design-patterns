package br.com.semcodar.store;

import br.com.semcodar.pizza.CheesePizza;
import br.com.semcodar.pizza.ClamPizza;
import br.com.semcodar.pizza.PepperoniPizza;
import br.com.semcodar.pizza.VeggiePizza;
import br.com.semcodar.pizza.Pizza;
import br.com.semcodar.pizza.ingredient.PizzaIngredientFactory;
import br.com.semcodar.pizza.region.*;

public class MGPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new MGPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(factory);
            pizza.setName("MG Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(factory);
            pizza.setName("MG Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(factory);
            pizza.setName("MG Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(factory);
            pizza.setName("MG Style Pepperoni Pizza");

        }
        return pizza;
    }
}
