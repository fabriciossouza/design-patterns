package br.com.semcodar.observer;

import br.com.semcodar.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
