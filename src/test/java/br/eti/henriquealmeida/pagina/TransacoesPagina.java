package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransacoesPagina extends ClientePagina {

    public TransacoesPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaResetar() {
        getInteracao().pesquisarElemento(By.xpath("//button[. = \"Reset\"]")).click();
    }
}
