package br.com.semcodar.burger.ingredient.factory;

import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;
import br.com.semcodar.burger.ingredient.bun.Bun;
import br.com.semcodar.burger.ingredient.bun.BurgerKingerBun;
import br.com.semcodar.burger.ingredient.cheese.BurgerKingCheese;
import br.com.semcodar.burger.ingredient.cheese.Cheese;
import br.com.semcodar.burger.ingredient.cutlet.BurgerKingCutlet;
import br.com.semcodar.burger.ingredient.cutlet.Cutlet;
import br.com.semcodar.burger.ingredient.sauce.BurgerKingSauce;
import br.com.semcodar.burger.ingredient.sauce.Sauce;

public class BurgerKingerIngredientFactory  implements BurgerIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new BurgerKingSauce();
    }

    @Override
    public Cheese createCheese() {
        return new BurgerKingCheese();
    }

    @Override
    public Bun createBun() {
        return new BurgerKingerBun();
    }

    @Override
    public Cutlet createCutlet() {
        return new BurgerKingCutlet();
    }
}
