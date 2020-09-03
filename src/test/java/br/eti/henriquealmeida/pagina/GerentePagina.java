package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GerentePagina extends BasePagina {

    public GerentePagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaoAdicionarCliente() {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Add\")]"));
    }

    public void clicarBotaoAbrirConta() {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Open\")]"));
    }

    public void clicarBotaoListarClientes() {
        getInteracao().clicarElemento(By.xpath("//button[contains(text(), \"Customers\")]"));
    }

    public String procurarValorTabela(String textoPesquisa) {
        String texto = "";
        List<WebElement> linhasTabela = getInteracao()
                .pesquisarMultiplosElementos(By.xpath("//table[@class =\"table table-bordered table-striped\"]//td"));

        for (WebElement elemento : linhasTabela) {
            if (elemento.getText().equals(textoPesquisa)) {
                texto = elemento.getText();
                break;
            }
        }
        return texto;
    }

    public void excluirCliente(String sobrenome) {
        WebElement elemento = getInteracao().pesquisarElemento
                (By.xpath("//table[@class = \"table table-bordered table-striped\"]/tbody//tr/td[contains (text(), \"" + sobrenome + "\")]/..//button"));

        elemento.click();
    }
}
