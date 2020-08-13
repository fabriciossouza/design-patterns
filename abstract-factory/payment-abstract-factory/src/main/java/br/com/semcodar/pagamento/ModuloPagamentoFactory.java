package br.com.semcodar.pagamento;

import br.com.semcodar.gestorderisco.GestorDeRisco;
import br.com.semcodar.operadora.Operadora;
import org.springframework.stereotype.Component;

@Component
public interface ModuloPagamentoFactory {

    public Operadora criarOperadora();

    public GestorDeRisco criarGestorDeRisco();

}
