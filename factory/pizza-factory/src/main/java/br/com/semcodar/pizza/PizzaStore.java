package br.com.semcodar.pizza;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PizzaStore {

    private SimplePizzaFactory factory;

    public Pizza orderPizza(String type) {

        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}