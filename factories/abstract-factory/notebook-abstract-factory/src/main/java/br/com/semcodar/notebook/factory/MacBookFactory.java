package br.com.semcodar.notebook.factory;

import br.com.semcodar.notebook.Laptop;
import br.com.semcodar.notebook.MacBook;
import br.com.semcodar.notebook.factory.componente.MacComponenteFactory;

public class MacBookFactory implements LaptopFactory {

    public Laptop montarComputador() {

        var factory = new MacComponenteFactory();

        return new MacBook(factory);
    }
}
