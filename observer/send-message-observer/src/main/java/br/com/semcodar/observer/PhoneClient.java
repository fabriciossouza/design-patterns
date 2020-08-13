package br.com.semcodar.observer;

import br.com.semcodar.subject.Subject;

import static java.lang.System.out;

public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void addMessage(String message){
        subject.setState(message.concat(" send from phone"));
    }

    @Override
    public void update() {
        out.println("Phone Stream " + subject.getState());
    }
}
