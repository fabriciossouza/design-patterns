package br.com.semcodar;

import br.com.semcodar.duck.Duck;
import br.com.semcodar.duck.MallardDuck;
import br.com.semcodar.duck.fly.FlyNoWay;

public class Demo {

    public static void main(String...args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();

    }
}
