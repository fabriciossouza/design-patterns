package br.com.semcodar;

import br.com.semcodar.product.IHotDrink;
import br.com.semcodar.product.enums.AvailableDrink;

public class Main {

    public static void main(String[] args) throws Exception {

        HotDrinkMachine machine = new HotDrinkMachine();
        IHotDrink tea = machine.makeDrink(AvailableDrink.TEA, 200);
        tea.consume();

        machine.makeDrink();

    }
}
