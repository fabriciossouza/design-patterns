package br.com.semcodar.notebook;

import br.com.semcodar.notebook.factory.componente.LaptopComponenteFactory;

public class MacBook extends Laptop {

    public MacBook(LaptopComponenteFactory factory) {
        super(factory);
    }

    @Override
    public String getDescricao() {
        return "MacBook Pro 13\"\n" + super.toString();

    }
}
