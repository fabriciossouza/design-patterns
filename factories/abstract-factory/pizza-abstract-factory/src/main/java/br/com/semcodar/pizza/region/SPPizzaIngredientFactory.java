package br.com.semcodar.pizza.region;


import br.com.semcodar.pizza.ingredient.PizzaIngredientFactory;
import br.com.semcodar.pizza.ingredient.cheese.Cheese;
import br.com.semcodar.pizza.ingredient.cheese.ReggianoCheese;
import br.com.semcodar.pizza.ingredient.clams.Clams;
import br.com.semcodar.pizza.ingredient.clams.FreshClams;
import br.com.semcodar.pizza.ingredient.dough.Dough;
import br.com.semcodar.pizza.ingredient.dough.ThinCrustDough;
import br.com.semcodar.pizza.ingredient.pepperoni.Pepperoni;
import br.com.semcodar.pizza.ingredient.pepperoni.SlicedPepperoni;
import br.com.semcodar.pizza.ingredient.sauce.Sauce;
import br.com.semcodar.pizza.ingredient.veggie.*;

public class SPPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
