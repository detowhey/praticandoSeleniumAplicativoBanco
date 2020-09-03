package br.eti.henriquealmeida.pagina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TransacaoPagina extends ClientePagina {

    public TransacaoPagina(WebDriver webDriver) {
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
                .pesquisarMultiplosElementos(By.xpath("//table[@class =\"table table-bordered table-striped\"]/tbody/tr/td"));

        for (WebElement elemento : linhasTabela) {
            if (elemento.getText().equals(valorTexto)) {
                texto = elemento.getText();
                break;
            }
        }
        return texto;
    }
}
