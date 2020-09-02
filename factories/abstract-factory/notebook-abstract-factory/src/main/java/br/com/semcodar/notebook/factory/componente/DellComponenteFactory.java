package br.com.semcodar.notebook.factory.componente;

import br.com.semcodar.notebook.componentes.display.Display;
import br.com.semcodar.notebook.componentes.display.DisplayDell;
import br.com.semcodar.notebook.componentes.graphic.GraphicCard;
import br.com.semcodar.notebook.componentes.graphic.GraphicCardDell;
import br.com.semcodar.notebook.componentes.processador.Processador;
import br.com.semcodar.notebook.componentes.processador.ProcessadorDell;
import br.com.semcodar.notebook.componentes.ssd.Disco;
import br.com.semcodar.notebook.componentes.ssd.SSDDell;

public class DellComponenteFactory implements LaptopComponenteFactory {

    public Display display(){
        return new DisplayDell();
    }

    public GraphicCard graphics(){
        return new GraphicCardDell();
    }

    public Processador processador(){
        return new ProcessadorDell();
    }

    public Disco disco(){
        return new SSDDell();
    }
}