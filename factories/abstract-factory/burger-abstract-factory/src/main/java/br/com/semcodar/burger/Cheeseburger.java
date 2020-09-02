package br.com.semcodar.burger;

import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;

import static java.lang.System.out;

public class Cheeseburger extends Burger {

    public Cheeseburger(BurgerIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void collect() {
        out.println("Collecting " + name);
        bun = ingredientFactory.createBun();
        cutlet = ingredientFactory.createCutlet();
        sauce = ingredientFactory.createSauce();
    }
}
