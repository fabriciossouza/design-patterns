package br.com.semcodar.shape;

import br.com.semcodar.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
