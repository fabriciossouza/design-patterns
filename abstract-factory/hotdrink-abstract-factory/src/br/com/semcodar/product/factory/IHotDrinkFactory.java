package br.com.semcodar.product.factory;

import br.com.semcodar.product.IHotDrink;

public interface IHotDrinkFactory {

    IHotDrink prepare(int amount);
}
