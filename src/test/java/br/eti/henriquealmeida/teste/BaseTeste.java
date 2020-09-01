package br.eti.henriquealmeida.teste;

import br.eti.henriquealmeida.interacao.Interacao;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTeste {

    private WebDriver webDriver;
    private Interacao interacao;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeClass
    public static void configurarWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void inicializarInstancias() {
        webDriver = new ChromeDriver();
        webDriver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        interacao = new Interacao(webDriver);
    }

    @After
    public void fecharNavegador() {
        webDriver.quit();
    }
}
