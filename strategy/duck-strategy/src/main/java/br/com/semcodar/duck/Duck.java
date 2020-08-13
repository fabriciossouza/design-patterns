package br.com.semcodar.duck;

import br.com.semcodar.duck.fly.FlyBehavior;
import br.com.semcodar.duck.quack.QuackBehavior;
import lombok.Setter;

import static java.lang.System.out;

public abstract class Duck {

    protected @Setter FlyBehavior flyBehavior;

    protected @Setter QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        out.println("All ducks float, even decoys!");
    }

}
