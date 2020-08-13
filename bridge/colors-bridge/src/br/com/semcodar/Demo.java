package br.com.semcodar;

import br.com.semcodar.color.BlueColor;
import br.com.semcodar.color.GreenColor;
import br.com.semcodar.color.RedColor;
import br.com.semcodar.shape.Circle;
import br.com.semcodar.shape.Square;

public class Demo {

    public static void main(String...args) {

        var blue = new BlueColor();
        var red = new RedColor();
        var green = new GreenColor();

        var square = new Square(blue);
        var greenCircle = new Circle(green);

        square.applyColor();
        greenCircle.applyColor();
    }
}
