package br.com.semcodar.obsevable;

import br.com.semcodar.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer){
        observers.add(observer);
    }

    protected void propertyChanged(T source, String propertyName, Object newValue) {
        observers.forEach(observer -> {
            observer.handle(new PropertyChangedEventArgs<T>(source, propertyName, newValue));
        });
    }
}
