package br.com.semcodar.button;

import static java.lang.System.out;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        out.println("You have created WindowsButton.");
    }
}