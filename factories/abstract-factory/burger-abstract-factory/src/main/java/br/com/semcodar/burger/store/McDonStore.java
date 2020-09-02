package br.com.semcodar.burger.store;

import br.com.semcodar.burger.Burger;
import br.com.semcodar.burger.Cheeseburger;
import br.com.semcodar.burger.Hamburger;
import br.com.semcodar.burger.VeganBurger;
import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;
import br.com.semcodar.burger.ingredient.factory.BurgerKingerIngredientFactory;
import br.com.semcodar.burger.ingredient.factory.McDonIngredientFactory;

public class McDonStore extends BurgerStore {

    @Override
    protected Burger createBurger(String type) {

        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new McDonIngredientFactory();

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("McDonalds Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);
                burger.setName("McDonalds Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("McDonalds Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("McDonalds Box");
        }

        return burger;
    }
}
