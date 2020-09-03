package br.eti.henriquealmeida.teste;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTeste {

    private WebDriver webDriver;

    protected WebDriver getWebDriver() {
        return webDriver;
    }

    @BeforeClass
    public static void configurarWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void iniciarConfiguracao() {
        webDriver = new ChromeDriver();
        webDriver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    @After
    public void fecharNavegador() {
        webDriver.quit();
    }

    protected void recarregarPagina() {
        webDriver.navigate().refresh();
    }
}
