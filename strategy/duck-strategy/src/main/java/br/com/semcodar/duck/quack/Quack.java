package br.com.semcodar.duck.quack;

import static java.lang.System.out;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        out.println("Quack!");
    }
}
