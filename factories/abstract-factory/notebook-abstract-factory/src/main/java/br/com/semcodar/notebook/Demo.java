package br.com.semcodar.notebook;

import br.com.semcodar.notebook.factory.DellFactory;
import br.com.semcodar.notebook.factory.MacBookFactory;

import static java.lang.System.out;

public class Demo {

    public static void main(String...args) {

        Laptop laptop;

        var dellFactory = new DellFactory();
        var macbookFactory = new MacBookFactory();


        out.println("-Olá, eu preciso de um laptop Windows");
        out.println("-OK! Aguarde um segundo, - Ligando para fábrica da Dell.\n" +
                "-Traga-me um laptop Dell");


        laptop = dellFactory.montarComputador();
        out.println(laptop.getDescricao());
        out.println("Aqui está!");

        out.println("-Olá, eu preciso de um laptop macOS");
        out.println("-OK! Aguarde um segundo, - Ligando para a fábrica da Apple. \n" +
                "- Traga-me um laptop MacBook");

        laptop = macbookFactory.montarComputador();
        out.println(laptop.getDescricao());
        out.println("Aqui está!");
    }
}
