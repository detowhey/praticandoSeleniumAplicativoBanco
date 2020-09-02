package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.pagina.AdicionarClientePagina;
import br.eti.henriquealmeida.pagina.GerentePagina;
import br.eti.henriquealmeida.pagina.InicialPagina;
import org.junit.Test;

public class GerenteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private GerentePagina gerentePagina;
    private AdicionarClientePagina adicionarClientePagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        gerentePagina = new GerentePagina(getWebDriver());
        adicionarClientePagina = new AdicionarClientePagina(getWebDriver());
    }

    @Test
    public void cadastrarCliente() {
        inicialPagina.clicarBotaoLoginGerente();
        gerentePagina.clicarBotaoAdicionarCliente();
        adicionarClientePagina.adicionarCliente("Henrique","Almeida","9923010");
    }


}
