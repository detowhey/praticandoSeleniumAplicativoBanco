package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.pagina.ClientePagina;
import br.eti.henriquealmeida.pagina.InicialPagina;
import org.junit.Test;

public class ClienteTeste extends BaseTeste {

    private InicialPagina inicialPagina;
    private ClientePagina clientePagina;

    @Override
    public void iniciarConfiguracao() {
        super.iniciarConfiguracao();
        inicialPagina = new InicialPagina(getWebDriver());
        clientePagina = new ClientePagina(getWebDriver());
    }

    @Test
    public void validarDeposito() {

    }


}
