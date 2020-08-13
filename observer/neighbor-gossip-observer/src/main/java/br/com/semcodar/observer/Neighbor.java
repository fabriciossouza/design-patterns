package br.com.semcodar.observer;

import br.com.semcodar.obsevable.Person;
import br.com.semcodar.obsevable.PropertyChangedEventArgs;

import static java.lang.System.out;

public class Neighbor implements Observer<Person> {


    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        out.println("Person's " + args.propertyName
                + " has been changed to " + args.newValue);
    }
}
