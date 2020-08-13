package br.com.semcodar.duck.fly;

import static java.lang.System.out;

public class FlyNoWay implements  FlyBehavior {

    @Override
    public void fly() {
        out.println("Não pode voar!");
    }
}
