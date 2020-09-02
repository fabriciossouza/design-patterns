package br.com.semcodar.burger.ingredient;

import br.com.semcodar.burger.ingredient.bun.Bun;
import br.com.semcodar.burger.ingredient.cheese.Cheese;
import br.com.semcodar.burger.ingredient.cutlet.Cutlet;
import br.com.semcodar.burger.ingredient.sauce.Sauce;

public interface BurgerIngredientFactory {

    public Sauce createSauce();
    public Cheese createCheese();
    public Bun createBun();
    public Cutlet createCutlet();

}
