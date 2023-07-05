package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class TesteSite {

    
    String BarraDePesquisa = "twotabsearchtextbox";
    int tempoEspera = 2000; // 2 segundos em milissegundos

    String mensagem = "twotabsearchtextbox";

    String ConfirmaPesquisa = "nav-search-submit-button";
    int tempoEspera1 = 2000; // 2 segundos em milissegundos

    String ClicarPS5 = "//*[@id=\'search\']/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[3]/div[1]/a";
    int tempoEspera2 = 2000; // 2 segundos em milissegundos

    String AdicionarAoCarrinho = "add-to-cart-button";

    int tempoEspera3 = 2000; // 2 segundos em milissegundos

    String ClicarJogo = "//*[@id=\'anonCarousel2\']/ol/li[3]/div/div/a/span/span[2]";

    int tempoEspera4 = 2000; // 2 segundos em milissegundos

    String AdicionarAoCarrinhoJogo = "add-to-cart-button";

    int tempoEspera5 = 2000; // 2 segundos em milissegundos




    /**
     * @throws InterruptedException
     */
    @Test
    public void testeAberturaNavegador() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br//");
        driver.manage().window().maximize();

        Thread.sleep(tempoEspera);
        driver.findElement(By.id(BarraDePesquisa)).click();
        Thread.sleep(tempoEspera);

        WebElement campoPesquisa = driver.findElement(By.id(mensagem));
        campoPesquisa.sendKeys("PS5");

        driver.findElement(By.id(ConfirmaPesquisa)).click();
        Thread.sleep(tempoEspera);

        // Rolagem automática de scroll
        Thread.sleep(tempoEspera);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 650)");

        driver.findElement(By.xpath(ClicarPS5)).click();
        Thread.sleep(tempoEspera);

        driver.findElement(By.id(AdicionarAoCarrinho)).click();
        Thread.sleep(tempoEspera);

        // Rolagem automática de scroll
        Thread.sleep(tempoEspera);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 650)");

        driver.findElement(By.xpath(ClicarJogo)).click();
        Thread.sleep(tempoEspera);

        driver.findElement(By.id(AdicionarAoCarrinhoJogo)).click();
        Thread.sleep(tempoEspera);


    }

}