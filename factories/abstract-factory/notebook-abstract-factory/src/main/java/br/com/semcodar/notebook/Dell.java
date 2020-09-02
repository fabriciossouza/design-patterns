package br.com.semcodar.notebook;

import br.com.semcodar.notebook.factory.componente.LaptopComponenteFactory;

public class Dell extends Laptop {

    public Dell(LaptopComponenteFactory factory) {
        super(factory);
    }

    @Override
    public String getDescricao() {
        return "Dell XPS 9370\n" + super.toString();
    }
}
