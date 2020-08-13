package br.com.semcodar.obsevable;

import lombok.Getter;

public class Person extends Observable<Person> {

    @Getter
    private String gossip;

    public void setGossip(String gossip) {

        if(gossip.equals(this.gossip)) return;

        this.gossip = gossip;
        propertyChanged(this,"gossip", gossip);

    }
}
