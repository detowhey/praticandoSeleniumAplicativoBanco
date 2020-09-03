package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.pagina.ClientePagina;
import br.eti.henriquealmeida.pagina.InicialPagina;
import br.eti.henriquealmeida.pagina.TransacoesPagina;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClienteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private ClientePagina clientePagina;
    private TransacoesPagina transacoesPagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        clientePagina = new ClientePagina(getWebDriver());
        transacoesPagina = new TransacoesPagina(getWebDriver());
    }

    @Test
    public void validarMensagemDepositoComSucesso() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Harry Potter");
        clientePagina.inserirValorDeposito("10");

        assertEquals("Deposit Successful", clientePagina.pegarValorMensagem());
    }

    @Test
    public void validarTransacao() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Hermoine Granger");
        clientePagina.clicarBotaoTransacoes();
        transacoesPagina.clicarBotaResetar();
        transacoesPagina.clicarBotaoVoltar();
        clientePagina.inserirValorDeposito("10");
        clientePagina.clicarBotaoTransacoes();
    }

    @Test
    public void validarMensagemSaqueComSucesso() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Hermoine Granger");
        clientePagina.inserirValorSaque("10");

        assertEquals("Transaction successful", clientePagina.pegarValorMensagem());
    }

    @Test
    public void validarInsucessoDeposito() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Hermoine Granger");
        clientePagina.inserirValorSaque("-1");

        assertTrue(clientePagina.pegarValorMensagem().isEmpty());
    }

    @Test
    public void validarInsucessoSaque() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Hermoine Granger");
        clientePagina.inserirValorDeposito("-1");

        assertTrue(clientePagina.pegarValorMensagem().isEmpty());
    }

    @Test
    public void validarMensagemSaqueSemSucesso() {
        inicialPagina.clicarBotaoLoginCliente();
        clientePagina.efetuarLoginCliente("Hermoine Granger");
        clientePagina.fazerSaqueMaiorQueDisponivel();

        assertEquals("Transaction Failed. You can not withdraw amount more than the balance.",
                clientePagina.pegarValorMensagem());
    }
}
