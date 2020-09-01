package br.eti.henriquealmeida.pagina;

import br.eti.henriquealmeida.interacao.Interacao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicialPagina {

    private final Interacao interacao;

    public InicialPagina(WebDriver webDriver) {
        interacao = new Interacao(webDriver);
    }


    public void clicarBotaoLoginCliente() {
        interacao.clicarElemento(By.xpath("//button[. = \"Customer Login\"]"));
    }

    public void clicarBotaoLoginGerente() {
        interacao.clicarElemento(By.xpath("//button[. = \"Bank Manager Login\"]"));
    }


}
