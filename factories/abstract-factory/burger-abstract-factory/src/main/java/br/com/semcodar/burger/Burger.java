package br.com.semcodar.burger;

import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;
import br.com.semcodar.burger.ingredient.bun.Bun;
import br.com.semcodar.burger.ingredient.cheese.Cheese;
import br.com.semcodar.burger.ingredient.cutlet.Cutlet;
import br.com.semcodar.burger.ingredient.sauce.Sauce;
import lombok.Getter;
import lombok.Setter;

import static java.lang.System.out;

public abstract class Burger {

    protected BurgerIngredientFactory ingredientFactory;

    public static final String CHEESE = "cheese";
    public static final String HAMBURGER = "hamburger";
    public static final String VEGAN = "vegan";

    @Setter
    protected String box;

    @Setter @Getter
    protected String name;

    protected Bun bun;
    protected Cutlet cutlet;
    protected Sauce sauce;
    protected Cheese cheese;
    public abstract void collect();

    public void box() {
        if (box != null) {
            out.println("Placing in official " + box);
        } else {
            out.println("Placing in official BurgerStore box");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (bun != null) {
            result.append(bun);
            result.append("\n");
        }
        if (cutlet != null) {
            result.append(cutlet);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        return result.toString();
    }
}