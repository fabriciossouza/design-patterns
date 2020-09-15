package br.com.semcodar.funcionario;

import static br.com.semcodar.funcionario.cargo.Cargo.JUNIOR;
import static br.com.semcodar.funcionario.cargo.Cargo.SENIOR;
import static java.lang.System.out;

public class Demo {

    public static void main(String[] args) {

        Funcionario funcionarioSenior = Funcionario.builder()
                .cargo(SENIOR)
                .nome("Funcionário Senior")
                .salario(15)
                .build();

        out.println(funcionarioSenior.calcularSalario());

        Funcionario funcionarioJunior = Funcionario.builder()
                .cargo(JUNIOR)
                .nome("Funcionário Junior")
                .salario(5)
                .build();

        out.println(funcionarioJunior.calcularSalario());
    }
}
