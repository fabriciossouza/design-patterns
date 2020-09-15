package br.com.semcodar.funcionario.cargo.salario;

import br.com.semcodar.funcionario.Funcionario;

public class RegraVinteDoisEMeioPorcento implements RegraPorCargo {

    @Override
    public double calcular(Funcionario funcionario) {
        return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
    }
}
