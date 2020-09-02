package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbrirContaPagina extends GerentePagina {

    public AbrirContaPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void selecionarOpcaoCliente(String textoVisivel) {
        getInteracao().selecionarOpcaoTextoVisivel(By.id("userSelect"), textoVisivel);
    }

    public void selecionarOpcaoMoeda(String textoVisivel) {
        getInteracao().selecionarOpcaoTextoVisivel(By.id("currency"), textoVisivel);
    }

    public void selecionarOpcaoMoeda() {
        getInteracao().pegarElementoAleatorioCaixaSelecao(By.id("currency"));
    }
}
