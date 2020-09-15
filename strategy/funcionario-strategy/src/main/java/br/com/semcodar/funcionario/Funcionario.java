package br.com.semcodar.funcionario;


import br.com.semcodar.funcionario.cargo.Cargo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Funcionario {

    private Integer id;
    private String nome;
    private double salario;
    private Cargo cargo;

    public double calcularSalario() {
        return this.getCargo().getRegra().calcular(this);
    }
}
