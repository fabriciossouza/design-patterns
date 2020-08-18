package br.com.semcodar.pizza.region;

import br.com.semcodar.pizza.ingredient.*;
import br.com.semcodar.pizza.ingredient.cheese.Cheese;
import br.com.semcodar.pizza.ingredient.cheese.MozzarellaCheese;
import br.com.semcodar.pizza.ingredient.clams.Clams;
import br.com.semcodar.pizza.ingredient.clams.FrozenClams;
import br.com.semcodar.pizza.ingredient.dough.Dough;
import br.com.semcodar.pizza.ingredient.dough.ThickCrustDough;
import br.com.semcodar.pizza.ingredient.pepperoni.Pepperoni;
import br.com.semcodar.pizza.ingredient.pepperoni.SlicedPepperoni;
import br.com.semcodar.pizza.ingredient.sauce.PlumTomatoSauce;
import br.com.semcodar.pizza.ingredient.sauce.Sauce;
import br.com.semcodar.pizza.ingredient.veggie.BlackOlives;
import br.com.semcodar.pizza.ingredient.veggie.Eggplant;
import br.com.semcodar.pizza.ingredient.veggie.Spinach;
import br.com.semcodar.pizza.ingredient.veggie.Veggies;

public class MGPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
