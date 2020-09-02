package br.com.semcodar.burger.store;

import br.com.semcodar.burger.Burger;
import br.com.semcodar.burger.Cheeseburger;
import br.com.semcodar.burger.Hamburger;
import br.com.semcodar.burger.VeganBurger;
import br.com.semcodar.burger.ingredient.BurgerIngredientFactory;
import br.com.semcodar.burger.ingredient.factory.BurgerKingerIngredientFactory;

public class BurgerKingStore extends BurgerStore {

    @Override
    protected Burger createBurger(String type) {

        Burger burger = null;
        BurgerIngredientFactory ingredientFactory = new BurgerKingerIngredientFactory();

        switch (type) {
            case Burger.CHEESE :
                burger = new Cheeseburger(ingredientFactory);
                burger.setName("BurgerKing Style Cheeseburger");
                break;
            case Burger.VEGAN :
                burger = new VeganBurger(ingredientFactory);
                burger.setName("BurgerKing Style VeganBurger");
                break;
            default:
                burger = new Hamburger(ingredientFactory);
                burger.setName("BurgerKing Style Hamburger");
                break;
        }

        if (burger !=null) {
            burger.setBox("BurgerKing Box");
        }

        return burger;
    }
}
