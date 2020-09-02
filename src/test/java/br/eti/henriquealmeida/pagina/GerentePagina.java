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

    public String procurarValorTabela(String valorTexto) {
        String texto = "";
        List<WebElement> linhasTabela = getInteracao()
                .pesquisarMultiplosElementos(By.xpath("//table[@class =\"table table-bordered table-striped\"]//td"));

        for (WebElement item : linhasTabela) {
            if (item.getText().equals(valorTexto)) {
                texto = item.getText();
                break;
            }
        }
        return texto;
    }

}
