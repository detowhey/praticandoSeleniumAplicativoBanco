package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicialPagina extends BasePagina {

    public InicialPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaoLoginCliente() {
        getInteracao().clicarElemento(By.xpath("//button[. = \"Customer Login\"]"));
    }

    public void clicarBotaoLoginGerente() {
        getInteracao().clicarElemento(By.xpath("//button[. = \"Bank Manager Login\"]"));
    }
}
