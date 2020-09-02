package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbrirContaPagina extends GerentePagina {

    public AbrirContaPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void abrirConta() {
        getInteracao().pegarElementoAleatorioCaixaSelecao(By.id("userSelect"));
        getInteracao().pegarElementoAleatorioCaixaSelecao(By.id("currency"));
        getInteracao().clicarElemento(By.xpath("//button[. = \"Process\"]"));
    }
}
