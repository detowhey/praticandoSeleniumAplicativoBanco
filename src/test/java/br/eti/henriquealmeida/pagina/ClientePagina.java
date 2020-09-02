package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientePagina extends BasePagina {

    public ClientePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void efetuarLoginCliente() {
        getInteracao().pegarElementoAleatorioCaixaSelecao(By.id("userSelect"));
        getInteracao().clicarElemento(By.xpath("//button[. = \"Login\"]'"));
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
        return getInteracao().pesquisarElemento(By.xpath("//span[. = \"Deposit Successful\"]")).getText();
    }

    public void listarTransacoces() {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Transactions\")]"));

    }
}
