package br.com.semcodar.product.factory;

import br.com.semcodar.product.IHotDrink;
import br.com.semcodar.product.Tea;

import static java.lang.System.out;

public class TeaFactory implements IHotDrinkFactory{

    @Override
    public IHotDrink prepare(int amount) {
        out.println(
            "Put in tea bag, boil water, pour "
            + amount +
            "ml, add lemon, enjoy!"
        );
        return new Tea();
    }
}
