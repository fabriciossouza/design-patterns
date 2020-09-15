package br.com.semcodar.funcionario.cargo;

import br.com.semcodar.funcionario.cargo.salario.RegraOnzePorcento;
import br.com.semcodar.funcionario.cargo.salario.RegraPorCargo;
import br.com.semcodar.funcionario.cargo.salario.RegraVinteDoisEMeioPorcento;
import lombok.Getter;

public enum Cargo {

    JUNIOR(new RegraOnzePorcento()),
    PLENO(new RegraOnzePorcento()),
    SENIOR(new RegraVinteDoisEMeioPorcento());

    private @Getter
    RegraPorCargo regra;

    Cargo(RegraPorCargo regra) {
        this.regra = regra;
    }
}
