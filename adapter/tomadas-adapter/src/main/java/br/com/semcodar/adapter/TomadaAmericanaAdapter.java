package br.com.semcodar.adapter;

import br.com.semcodar.plug.PlugBrasileiro;
import br.com.semcodar.tomada.TomadaAmericana;

public class TomadaAmericanaAdapter extends TomadaAmericana {

    public String conecta(PlugBrasileiro plug){
        return plug.obtemEletricidade().concat(this.getNomeRede());
    }

}
