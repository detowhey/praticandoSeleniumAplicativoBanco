package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.pagina.InicialPagina;
import org.junit.Before;
import org.junit.Test;

public class paginaInicialTeste extends BaseTeste {


    InicialPagina inicialPagina;

    @Before
    public void iniciarInstancias(){
        inicialPagina = new InicialPagina(getWebDriver());
    }

    @Test
    public void testarEnderecoBotaoLoginUsuario() {
        inicialPagina.clicarBotaoLoginCliente();
    }

}
