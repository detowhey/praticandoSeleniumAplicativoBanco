package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdicionarClientePagina extends GerentePagina {

    public AdicionarClientePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void adicionarCliente(String nome, String sobrenome, String codigoPostal) {

        getInteracao().inserirTextoElemento(By.xpath("//label[. = \"First Name :\"]/../input"), nome);
        getInteracao().inserirTextoElemento(By.xpath("//label[. = \"Last Name :\"]/../input"), sobrenome);
        getInteracao().inserirTextoElemento(By.xpath("//label[. = \"Post Code :\"]/../input"), codigoPostal);
        getInteracao().clicarElemento(By.xpath("//div[@class =\"marTop\" ]//button"));
        getInteracao().aceitarAlerta();
    }
}
