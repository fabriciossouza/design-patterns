package br.com.semcodar;

import br.com.semcodar.dialog.Dialog;
import br.com.semcodar.dialog.DialogHtmlFactory;
import br.com.semcodar.dialog.DialogMacFactory;

import static java.lang.System.getProperty;

public class Demo {

    public static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static void configure() {

        if (getProperty("os.name").equals("Mac OS X")) {
            dialog = new DialogMacFactory();
        } else
            dialog = new DialogHtmlFactory();
    }
}


