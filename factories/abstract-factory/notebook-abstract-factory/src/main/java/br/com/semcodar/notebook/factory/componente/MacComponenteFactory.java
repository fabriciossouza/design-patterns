package br.com.semcodar.notebook.factory.componente;

import br.com.semcodar.notebook.componentes.display.Display;
import br.com.semcodar.notebook.componentes.display.DisplayMac;
import br.com.semcodar.notebook.componentes.graphic.GraphicCard;
import br.com.semcodar.notebook.componentes.graphic.GraphicCardMac;
import br.com.semcodar.notebook.componentes.processador.Processador;
import br.com.semcodar.notebook.componentes.processador.ProcessadorMac;
import br.com.semcodar.notebook.componentes.ssd.Disco;
import br.com.semcodar.notebook.componentes.ssd.SSDMac;


public class MacComponenteFactory implements LaptopComponenteFactory {

    public Display display(){
        return new DisplayMac();
    }

    public GraphicCard graphics(){
        return new GraphicCardMac();
    }

    public Processador processador(){
        return new ProcessadorMac();
    }

    public Disco disco(){
        return new SSDMac();
    }
}