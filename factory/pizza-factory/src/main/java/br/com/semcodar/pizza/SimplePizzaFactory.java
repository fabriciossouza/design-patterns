package br.com.semcodar.pizza;

import br.com.semcodar.menu.CheesePizza;
import br.com.semcodar.menu.ClamPizza;
import br.com.semcodar.menu.PepperoniPizza;
import br.com.semcodar.menu.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
