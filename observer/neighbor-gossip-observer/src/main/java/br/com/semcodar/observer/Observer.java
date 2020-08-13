package br.com.semcodar.observer;

import br.com.semcodar.obsevable.PropertyChangedEventArgs;

public interface Observer<T> {

    public void handle(PropertyChangedEventArgs<T> args);
}
