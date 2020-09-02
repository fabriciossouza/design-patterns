package br.com.semcodar.burger;

import br.com.semcodar.burger.store.BurgerKingStore;
import br.com.semcodar.burger.store.BurgerStore;
import br.com.semcodar.burger.store.McDonStore;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore mcDonalds = new McDonStore();
        BurgerStore burgerKing = new BurgerKingStore();

        Burger burger;

        System.out.println("-Hello, one McDonalds style cheeseburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the McDonaldsStore. -Cheeseburger");
        burger = mcDonalds.orderBurger(Burger.CHEESE);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName() + "\n");

        System.out.println("-Hello, one BurgerKing style hamburger");
        System.out.println("-Okay! Please wait for a sec, -Calling to the BurgerKingStore. -Hamburger\"");
        burger = burgerKing.orderBurger(Burger.HAMBURGER);
        Thread.sleep(1500);
        System.out.println("There it is!");
        System.out.println(burger.getName());
    }
}