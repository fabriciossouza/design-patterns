package br.com.semcodar.notebook;

import br.com.semcodar.notebook.componentes.display.Display;
import br.com.semcodar.notebook.componentes.graphic.GraphicCard;
import br.com.semcodar.notebook.componentes.processador.Processador;
import br.com.semcodar.notebook.componentes.ssd.Disco;
import br.com.semcodar.notebook.factory.componente.LaptopComponenteFactory;

public abstract class Laptop {

    private LaptopComponenteFactory componenteFactory;

    public Laptop(LaptopComponenteFactory componenteFactory) {
        this.display = componenteFactory.display();
        this.graphicCard = componenteFactory.graphics();
        this.processador = componenteFactory.processador();
        this.disco = componenteFactory.disco();
    }

    protected Display display;
    protected GraphicCard graphicCard;
    protected Processador processador;
    protected Disco disco;

    public abstract String getDescricao();

    public String toString() {
        return "Display: " + display.toString() + "\n"
            + "GraphicCard: " + graphicCard.toString() + "\n"
            + "Processor: " + processador.toString() + "\n"
            + "SSD: " + disco.toString();
    }
}
