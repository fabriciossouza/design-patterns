package br.com.semcodar.pizza.ingredient;

import br.com.semcodar.pizza.ingredient.cheese.Cheese;
import br.com.semcodar.pizza.ingredient.clams.Clams;
import br.com.semcodar.pizza.ingredient.dough.Dough;
import br.com.semcodar.pizza.ingredient.pepperoni.Pepperoni;
import br.com.semcodar.pizza.ingredient.sauce.Sauce;
import br.com.semcodar.pizza.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
