package br.com.semcodar;


import br.com.semcodar.observer.Neighbor;
import br.com.semcodar.obsevable.Person;

import static java.util.Arrays.asList;

public class Demo{

    public static void main(String...args) {

        var person = new Person();
        var neighbor = new Neighbor();
        var neighbor1 = new Neighbor();

        person.subscribe(neighbor);
        person.subscribe(neighbor1);

        var gossip = asList("flirt", "earned money", "traveled");

        gossip.forEach( g -> person.setGossip(g) );
    }
}