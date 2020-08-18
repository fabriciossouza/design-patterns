package br.com.semcodar;

import br.com.semcodar.pizza.Pizza;
import br.com.semcodar.store.PizzaStore;
import br.com.semcodar.store.SPPizzaStore;

public class PizzaDelivery {

    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new SPPizzaStore();

        final Pizza queijo = nyPizzaStore.orderPizza("cheese");


    }
}
