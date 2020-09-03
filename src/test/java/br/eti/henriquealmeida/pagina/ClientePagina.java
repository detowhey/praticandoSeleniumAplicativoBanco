package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientePagina extends BasePagina {

    public ClientePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void efetuarLoginCliente(String nomeCliente) {
        getInteracao().selecionarOpcaoTextoVisivel(By.id("userSelect"), nomeCliente);
        getInteracao().clicarElemento(By.xpath("//button[. = \"Login\"]"));
    }

    public void inserirValorSaque(String valor) {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Withdrawl\")]"));
        getInteracao().inserirTextoElemento(By.xpath("//label[. = \"Amount to be Withdrawn :\"]//../input"), valor);
        getInteracao().clicarElemento(By.xpath("//button[@type = \"submit\"]"));
    }

    public void inserirValorDeposito(String valor) {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Deposit\")]"));
        getInteracao().inserirTextoElemento(By.xpath("//label[. = \"Amount to be Deposited :\"]//../input"), valor);
        getInteracao().clicarElemento(By.xpath("//button[@type = \"submit\"]"));
    }

    public String pegarValorMensagem() {
        return getInteracao().pegarTextoElemento(By.xpath("//body/div[@class = \"ng-scope\"]//span[@ng-show = \"message\"]"));
    }

    public void clicarBotaoTransacoes() {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Transactions\")]"));
    }

    public void fazerSaqueMaiorQueDisponivel() {
        String valorDisponivel = getInteracao().
                pegarTextoElemento(By.xpath("//div[@ng-hide=\"noAccount\" and @class= \"center\"][1]/strong[2]"));

        int saqueMaior = Integer.parseInt(valorDisponivel) + 1;
        inserirValorSaque(String.valueOf(saqueMaior));
    }
}
