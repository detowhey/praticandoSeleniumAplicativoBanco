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

    public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao) {
        //procurar coluna do registro
        WebElement tabela = getInteracao().pesquisarElemento(By.xpath("//*[@id='elementosForm:tableUsuarios']"));
        int idColuna = obterIndiceColuna(colunaBusca, tabela);

        //encontrar a linha do registro
        int idLinha = obterIndiceLinha(valor, tabela, idColuna);

        //procurar coluna do botao
        int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);

        //clicar no botao da celula encontrada
        WebElement celula = tabela.findElement(By.xpath(".//tr[" + idLinha + "]/td[" + idColunaBotao + "]"));
        celula.findElement(By.xpath(".//input")).click();

    }

    private int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
        List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td[" + idColuna + "]"));
        int idLinha = -1;

        for (int i = 0; i < linhas.size(); i++) {
            if (linhas.get(i).getText().equals(valor)) {
                idLinha = i + 1;
                break;
            }
        }
        return idLinha;
    }

    private int obterIndiceColuna(String coluna, WebElement tabela) {
        List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
        int idColuna = -1;

        for (int i = 0; i < colunas.size(); i++) {
            if (colunas.get(i).getText().equals(coluna)) {
                idColuna = i + 1;
                break;
            }
        }
        return idColuna;
    }
}
