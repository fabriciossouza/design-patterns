package br.com.semcodar.pizza;


import br.com.semcodar.pizza.ingredient.PizzaIngredientFactory;
import br.com.semcodar.pizza.ingredient.cheese.Cheese;
import br.com.semcodar.pizza.ingredient.clams.Clams;
import br.com.semcodar.pizza.ingredient.dough.Dough;
import br.com.semcodar.pizza.ingredient.pepperoni.Pepperoni;
import br.com.semcodar.pizza.ingredient.sauce.Sauce;
import br.com.semcodar.pizza.ingredient.veggie.Veggies;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public abstract class Pizza {

    protected PizzaIngredientFactory factory;

    @Setter
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

}

