package br.com.semcodar.store;

import br.com.semcodar.pizza.CheesePizza;
import br.com.semcodar.pizza.ClamPizza;
import br.com.semcodar.pizza.PepperoniPizza;
import br.com.semcodar.pizza.VeggiePizza;
import br.com.semcodar.pizza.Pizza;
import br.com.semcodar.pizza.ingredient.PizzaIngredientFactory;
import br.com.semcodar.pizza.region.*;

public class SPPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new SPPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("SP Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("SP Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("SP Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("SP Style Pepperoni Pizza");

        }
        return pizza;
    }
}
