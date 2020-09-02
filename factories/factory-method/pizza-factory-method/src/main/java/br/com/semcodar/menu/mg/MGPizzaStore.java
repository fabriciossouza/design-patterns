package br.com.semcodar.menu.mg;

import br.com.semcodar.pizza.Pizza;
import br.com.semcodar.pizza.PizzaStore;

public class MGPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {

        if (item.equals("cheese")) {
            return new MGStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new MGStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new MGStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new MGStylePepperoniPizza();
        }

        return null;
    }
}
