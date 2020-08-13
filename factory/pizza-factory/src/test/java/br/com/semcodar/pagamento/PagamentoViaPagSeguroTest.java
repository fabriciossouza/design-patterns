package br.com.semcodar.pagamento;

import br.com.semcodar.gestorderisco.AlertaDeRiscoException;
import br.com.semcodar.operadora.CapturaNaoAutorizadaException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

public class PagamentoViaPagSeguroTest {

    @Autowired
    private Pagamento pagamento;

    @Before
    public void init() {
    }

    @Test
    public void deveAutorizarVenda() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        Long codigoAutorizacao = pagamento.autorizar("2222.2222", new BigDecimal("200"));
        assertNotNull(codigoAutorizacao);
    }

    @Test(expected=CapturaNaoAutorizadaException.class)
    public void deveNegarCaptura_cartaoInvalido() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        pagamento.autorizar("5555.2222", new BigDecimal("2000"));
    }

    @Test(expected= AlertaDeRiscoException.class)
    public void deveGerarAlertaDeRisco() throws CapturaNaoAutorizadaException, AlertaDeRiscoException {
        pagamento.autorizar("7777.2222", new BigDecimal("5500"));
    }
}
