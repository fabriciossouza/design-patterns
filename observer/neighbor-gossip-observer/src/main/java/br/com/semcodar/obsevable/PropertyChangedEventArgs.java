package br.com.semcodar.obsevable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PropertyChangedEventArgs<T> {
    public T source;
    public String propertyName;
    public Object newValue;
}