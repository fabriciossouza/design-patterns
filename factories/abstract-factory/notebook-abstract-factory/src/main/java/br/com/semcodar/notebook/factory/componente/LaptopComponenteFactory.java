package br.com.semcodar.notebook.factory.componente;

import br.com.semcodar.notebook.componentes.display.Display;
import br.com.semcodar.notebook.componentes.graphic.GraphicCard;
import br.com.semcodar.notebook.componentes.processador.Processador;
import br.com.semcodar.notebook.componentes.ssd.Disco;

public interface LaptopComponenteFactory {

    public Display display();

    public GraphicCard graphics();

    public Processador processador();

    public Disco disco();
}