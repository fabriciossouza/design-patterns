package br.com.semcodar.burger.store;

import br.com.semcodar.burger.Burger;

import static java.lang.System.out;

public abstract class BurgerStore {

    protected abstract Burger createBurger(final String type);

    public Burger orderBurger(final String type){

        final Burger burger = createBurger(type);
        out.println("--- Making a " + burger.getName() + " ----");

        burger.box();
        burger.collect();

        return burger;
    }

}
