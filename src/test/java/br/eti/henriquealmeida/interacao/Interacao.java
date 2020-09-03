package br.eti.henriquealmeida.interacao;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Interacao {

    private final WebDriver webDriver;

    public Interacao(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement pesquisarElemento(By tipoPesquisa) {
        return webDriver.findElement(tipoPesquisa);
    }

    public List<WebElement> pesquisarMultiplosElementos(By tipoPesquisa) {
        return webDriver.findElements(tipoPesquisa);
    }

    public void clicarElemento(By tipoPesquisa) {
        pesquisarElemento(tipoPesquisa).click();
    }

    public void inserirTextoElemento(By tipoPesquisa, String texto) {
        pesquisarElemento(tipoPesquisa).sendKeys(texto);
    }

    public void selecionarOpcaoTextoVisivel(By tipoPesquisa, String valorVisivel) {
        new Select(pesquisarElemento(tipoPesquisa)).selectByVisibleText(valorVisivel);
    }

    public List<WebElement> pegarOpcoesCaixaSelecao(By tipoPesquisa) {
        return new Select(pesquisarElemento(tipoPesquisa)).getOptions();
    }

    public void selecionarElementoAleatorioCaixaSelecao(By tipoPesquisa) {
        Random randomico = new Random();
        int tamanhoLista = pegarOpcoesCaixaSelecao(tipoPesquisa).size();
        int indiceAleatorio = randomico.nextInt(tamanhoLista);

        if (indiceAleatorio == 0)
            indiceAleatorio += 1;

        pegarOpcoesCaixaSelecao(tipoPesquisa).get(indiceAleatorio).click();
    }

    public String pegarTextoElemento(By tipoPesquisa) {
        return pesquisarElemento(tipoPesquisa).getText();
    }

    public void aceitarAlerta() {
        Alert alerta = webDriver.switchTo().alert();
        alerta.accept();
    }
}
