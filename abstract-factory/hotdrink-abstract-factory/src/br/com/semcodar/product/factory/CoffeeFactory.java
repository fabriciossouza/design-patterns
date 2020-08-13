package br.com.semcodar.product.factory;

import br.com.semcodar.product.Coffee;
import br.com.semcodar.product.IHotDrink;

import static java.lang.System.out;

public class CoffeeFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount) {
        out.println("Grind some beans, boil water, pour "
            + amount +
            " ml, add cream and sugar, enjoy!"
        );
        return new Coffee();
    }
}
