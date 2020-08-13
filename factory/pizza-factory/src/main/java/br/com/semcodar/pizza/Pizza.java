package br.com.semcodar.pizza;


import lombok.Getter;
import lombok.Singular;

import java.util.ArrayList;

@Getter
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;

    @Singular
    protected ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }
}
