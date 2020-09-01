package br.eti.henriquealmeida.interacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Interacao {

    private final WebDriver webDriver;

    public Interacao(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebElement pesquisarElemento(String idElemento) {
        return webDriver.findElement(By.id(idElemento));
    }

    private WebElement pesquisarElemento(By tipoPesquisa) {
        return webDriver.findElement(tipoPesquisa);
    }

    public List<WebElement> pesquisarMultiplosElementos(By tipoPesquisa) {
        return webDriver.findElements(tipoPesquisa);
    }

    public void clicarElemento(String idElemento) {
        pesquisarElemento(idElemento).click();
    }

    public void clicarElemento(By tipoPesquisa) {
        pesquisarElemento(tipoPesquisa).click();
    }

    public void inserirTextoElemento(String idElemento, String texto) {
        pesquisarElemento(idElemento).sendKeys(texto);
    }

    public void inserirTextoElemento(By tipoPesquisa, String texto) {
        pesquisarElemento(tipoPesquisa).sendKeys(texto);
    }

    public void inserirTextoElemento(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public void selecionarOpcaoTextoVisivel(By tipoPesquisa, String valorVisivel) {
        new Select(pesquisarElemento(tipoPesquisa)).selectByVisibleText(valorVisivel);
    }

    public void selecionarOpcaoPorValor(By tipoPesquisa, String valor) {
        new Select(pesquisarElemento(tipoPesquisa)).selectByValue(valor);
    }

    public String pegarTextoElemento(By tipoPesquisa) {
        return pesquisarElemento(tipoPesquisa).getText();
    }

    public String pegarValorElemento(By tipoPesquisa) {
        return pesquisarElemento(tipoPesquisa).getAttribute("value");
    }

    public boolean verificarRadioSelecionado(String idElemento) {
        return pesquisarElemento(idElemento).isSelected();
    }

    public boolean verificarRadioSelecionado(By tipoPesquisa) {
        return pesquisarElemento(tipoPesquisa).isSelected();
    }
}
