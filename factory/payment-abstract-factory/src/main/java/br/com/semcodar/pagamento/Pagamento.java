package br.com.semcodar.pagamento;

import br.com.semcodar.gestorderisco.AlertaDeRiscoException;
import br.com.semcodar.gestorderisco.GestorDeRisco;
import br.com.semcodar.operadora.CapturaNaoAutorizadaException;
import br.com.semcodar.operadora.Operadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Pagamento {

    private Operadora operadora;
    private GestorDeRisco gestorDeRisco;

    @Autowired
    public Pagamento(ModuloPagamentoFactory moduloPagamentoFactory) {
        this.operadora = moduloPagamentoFactory.criarOperadora();
        this.gestorDeRisco = moduloPagamentoFactory.criarGestorDeRisco();
    }

    public Long autorizar(String cartao, BigDecimal valor) throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        this.operadora.capturar(cartao, valor);
        this.gestorDeRisco.avaliarRisco(cartao, valor);
        return this.operadora.confirmar();
    }
}
