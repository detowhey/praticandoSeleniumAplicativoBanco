package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.pagina.AbrirContaPagina;
import br.eti.henriquealmeida.pagina.AdicionarClientePagina;
import br.eti.henriquealmeida.pagina.GerentePagina;
import br.eti.henriquealmeida.pagina.InicialPagina;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GerenteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private GerentePagina gerentePagina;
    private AdicionarClientePagina adicionarClientePagina;
    private AbrirContaPagina abrirContaPagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        gerentePagina = new GerentePagina(getWebDriver());
        adicionarClientePagina = new AdicionarClientePagina(getWebDriver());
        abrirContaPagina = new AbrirContaPagina(getWebDriver());
    }

    @Test
    public void validarCadastroCliente() {
        String nome = "Henrique";
        String sobrenome = "Almeida";
        String codigoPostal = "9923010";

        inicialPagina.clicarBotaoLoginGerente();
        gerentePagina.clicarBotaoAdicionarCliente();
        adicionarClientePagina.adicionarCliente(nome, sobrenome, codigoPostal);
        gerentePagina.clicarBotaoListarClientes();

        assertEquals(nome, gerentePagina.procurarValorTabela(nome));
        assertEquals(sobrenome, gerentePagina.procurarValorTabela(sobrenome));
        assertEquals(codigoPostal, gerentePagina.procurarValorTabela(codigoPostal));
    }

    @Test
    public void abrirConta() {
        inicialPagina.clicarBotaoLoginGerente();
        gerentePagina.clicarBotaoAbrirConta();
        abrirContaPagina.abrirConta();
    }

}
