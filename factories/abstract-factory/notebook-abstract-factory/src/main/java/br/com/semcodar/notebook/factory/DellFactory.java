package br.com.semcodar.notebook.factory;

import br.com.semcodar.notebook.Dell;
import br.com.semcodar.notebook.Laptop;
import br.com.semcodar.notebook.factory.componente.DellComponenteFactory;

public class DellFactory implements LaptopFactory {

    public Laptop montarComputador() {

        var factory = new DellComponenteFactory();

        return new Dell(factory);
    }
}
