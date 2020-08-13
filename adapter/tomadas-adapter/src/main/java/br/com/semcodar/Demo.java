package br.com.semcodar;

import br.com.semcodar.adapter.TomadaAmericanaAdapter;
import br.com.semcodar.adapter.TomadaBrasileiraAdapter;
import br.com.semcodar.plug.PlugAmericano;
import br.com.semcodar.plug.PlugBrasileiro;

import static java.lang.System.out;

public class Demo {

    public static void main(String[] args) {

        var plugBR = new PlugBrasileiro();
        var plugEUA = new PlugAmericano();

        var tomadaAdaptadaParaEUA = new TomadaAmericanaAdapter();
        var tomadaAdaptadaParaBR = new TomadaBrasileiraAdapter();


        out.println(tomadaAdaptadaParaEUA.conecta(plugBR));
        out.println(tomadaAdaptadaParaEUA.conecta(plugEUA));

        out.println(tomadaAdaptadaParaBR.conecta(plugEUA));
        out.println(tomadaAdaptadaParaBR.conecta(plugBR));

    }
}
