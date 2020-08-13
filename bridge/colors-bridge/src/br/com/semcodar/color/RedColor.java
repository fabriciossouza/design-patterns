package br.com.semcodar.color;

import static java.lang.System.out;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        out.printf("Applying red color");
    }
}
