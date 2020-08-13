package br.com.semcodar.duck;

import br.com.semcodar.duck.fly.FlyBehavior;
import br.com.semcodar.duck.fly.FlyWithWings;
import br.com.semcodar.duck.quack.Quack;
import br.com.semcodar.duck.quack.QuackBehavior;

import static java.lang.System.out;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public MallardDuck(FlyBehavior fly, QuackBehavior quack) {
        this.flyBehavior = fly;
        this.quackBehavior = quack;
    }

    @Override
    public void display() {
        out.println("I'm a real Mallard duck");
    }
}
