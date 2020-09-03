package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbrirContaPagina extends GerentePagina {

    public AbrirContaPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void abrirConta() {
        getInteracao().selecionarElementoAleatorioCaixaSelecao(By.id("userSelect"));
        getInteracao().selecionarElementoAleatorioCaixaSelecao(By.id("currency"));
        getInteracao().clicarElemento(By.xpath("//button[. = \"Process\"]"));
    }
}
