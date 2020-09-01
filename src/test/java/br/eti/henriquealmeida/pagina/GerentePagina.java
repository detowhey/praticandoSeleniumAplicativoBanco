package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerentePagina extends BasePagina{

    public GerentePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaoAdicionarCliente(){
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Add\")]"));
    }

    public void clicarBotaoAbrirConta(){
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Open\")]"));
    }

    public void clicarBotaoClientes(){
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Customers\")]"));
    }
}
