package br.com.semcodar.adapter;

import br.com.semcodar.plug.PlugAmericano;
import br.com.semcodar.tomada.TomadaBrasileira;

public class TomadaBrasileiraAdapter extends TomadaBrasileira {

    public String conecta(PlugAmericano plug){
        return plug.obtemEletricidade().concat(this.getNomeRede());
    }

}
