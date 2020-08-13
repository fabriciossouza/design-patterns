package br.com.semcodar.observer;

import br.com.semcodar.subject.Subject;

import static java.lang.System.out;

public class TableClient extends Observer {

    public TableClient(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message.concat(" send from table"));
    }

    @Override
    public void update() {
        out.println("Table Stream " + subject.getState());
    }
}
