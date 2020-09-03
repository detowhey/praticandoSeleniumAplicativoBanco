package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TransacoesPagina extends ClientePagina {

    public TransacoesPagina(WebDriver webDriver) {
        super(webDriver);
    }

    public void clicarBotaResetar() {
        getInteracao().clicarElemento(By.xpath("//button[. = \"Reset\"]"));
    }

    public void clicarBotaoVoltar() {
        getInteracao().clicarElemento(By.xpath("//button[@class=\"btn\" and . = \"Back\"]"));
    }

    public String procurarValorTabela(String valorTexto) {
        String texto = "";
        List<WebElement> linhasTabela = getInteracao()
                .pesquisarMultiplosElementos(By.xpath("//table[@class =\"table table-bordered table-striped\"]"));

        for (WebElement item : linhasTabela) {
            if (item.getText().equals(valorTexto)) {
                texto = item.getText();
                break;
            }
        }
        return texto;
    }
}
