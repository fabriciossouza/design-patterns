package br.com.semcodar.shape;

import br.com.semcodar.color.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
