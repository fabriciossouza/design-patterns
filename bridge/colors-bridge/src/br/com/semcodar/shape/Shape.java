package br.com.semcodar.shape;

import br.com.semcodar.color.Color;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract  class Shape {

    protected Color color;

    abstract public void applyColor();
}
