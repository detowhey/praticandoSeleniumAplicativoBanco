package br.eti.henriquealmeida.pagina;

import br.eti.henriquealmeida.interacao.Interacao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePagina {

    private final Interacao interacao;

    BasePagina(WebDriver webDriver) {
        interacao = new Interacao(webDriver);
    }

    protected Interacao getInteracao() {
        return interacao;
    }

    protected void clicarBotaoIniciaç(){
        interacao.clicarElemento(By.xpath("//button[. = \"Home\"]"));
    }
}
