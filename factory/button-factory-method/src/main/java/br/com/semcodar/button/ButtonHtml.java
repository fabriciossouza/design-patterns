package br.com.semcodar.button;

import static java.lang.System.out;

public class ButtonHtml implements Button {

    @Override
    public void render() {
        out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        out.println("Click! Button says - 'Hello World!'");
    }

}
