package br.com.semcodar.duck.fly;

public class FlyWithWings implements  FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Voando!");
    }
}
