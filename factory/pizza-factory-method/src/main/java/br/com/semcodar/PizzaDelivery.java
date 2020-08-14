package br.com.semcodar;

import br.com.semcodar.menu.mg.MGPizzaStore;
import br.com.semcodar.menu.sp.SPPizzaStore;

import static java.lang.System.out;

public class PizzaDelivery {

    public static void main(String[] args) {

        var spStore = new SPPizzaStore();
        var mgStore = new MGPizzaStore();

        var pizza = spStore.orderPizza("cheese");
        out.println("Fabricio ordered a " + pizza.getName() + "\n");

        pizza = mgStore.orderPizza("cheese");
        out.println("Juliana ordered a " + pizza.getName() + "\n");

        pizza = spStore.orderPizza("clam");
        out.println("Fabricio ordered a " + pizza.getName() + "\n");

        pizza = mgStore.orderPizza("clam");
        out.println("Juliana ordered a " + pizza.getName() + "\n");

        pizza = spStore.orderPizza("pepperoni");
        out.println("Fabricio ordered a " + pizza.getName() + "\n");

        pizza = mgStore.orderPizza("pepperoni");
        out.println("Juliana ordered a " + pizza.getName() + "\n");

        pizza = spStore.orderPizza("veggie");
        out.println("Fabricio ordered a " + pizza.getName() + "\n");

        pizza = mgStore.orderPizza("veggie");
        out.println("Juliana ordered a " + pizza.getName() + "\n");

    }
}
