package br.com.semcodar.burger.ingredient.factory;

import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;
import br.com.semcodar.burger.ingredient.bun.Bun;
import br.com.semcodar.burger.ingredient.bun.McDonBun;
import br.com.semcodar.burger.ingredient.cheese.Cheese;
import br.com.semcodar.burger.ingredient.cheese.McDonCheese;
import br.com.semcodar.burger.ingredient.cutlet.Cutlet;
import br.com.semcodar.burger.ingredient.cutlet.McDonCutlet;
import br.com.semcodar.burger.ingredient.sauce.McDonSauce;
import br.com.semcodar.burger.ingredient.sauce.Sauce;

public class McDonIngredientFactory implements BurgerIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new McDonSauce();
    }

    @Override
    public Cheese createCheese() {
        return new McDonCheese();
    }

    @Override
    public Bun createBun() {
        return new McDonBun();
    }

    @Override
    public Cutlet createCutlet() {
        return new McDonCutlet();
    }
}
