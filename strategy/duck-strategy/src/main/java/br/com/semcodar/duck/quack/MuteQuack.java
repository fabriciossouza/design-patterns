package br.com.semcodar.duck.quack;

import static java.lang.System.out;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        out.println("<< Silence >>");
    }
}
