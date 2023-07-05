package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteTecnicoNT {


    String LupaDePesquisa = "//*[@id=\'search-open\']";
    int tempoEspera = 2000; // 2 segundos em milissegundos

    String BarraDePesquisa = "//*[@id=\'masthead\']/div[1]/div[2]/form/label/input";
    int tempoEspera1 = 2000; // 2 segundos em milissegundos

    String mensagem = "//*[@id=\'masthead\']/div[1]/div[2]/form/label/input";
    int tempoEspera2 = 2000; // 2 segundos em milissegundos

    String ConfirmaPesquisa = "//*[@id=\'masthead\']/div[1]/div[2]/form/input";
    //int tempoEspera3 = 2000; // 2 segundos em milissegundos

    String Logo = "//*[@id=\'site-branding\']/div/a/img";
    int tempoEspera4 = 2000; // 2 segundos em milissegundos

    String mensagem2 = "//*[@id=\'masthead\']/div[1]/div[2]/form/label/input";
    int tempoEspera5 = 2000; // 2 segundos em milissegundos
    String ConfirmaPesquisa2 = "//*[@id=\'masthead\']/div[1]/div[2]/form/input";
    int tempoEspera6 = 2000; // 2 segundos em milissegundos


    /**
     * @throws InterruptedException
     */
    @Test
    public void testeAberturaNavegador() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blogdoagi.com.br/");
        driver.manage().window().maximize();

        //Pesquisa Com erro ortográfico
        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(LupaDePesquisa)).click();
        Thread.sleep(tempoEspera);

        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(BarraDePesquisa)).click();
        Thread.sleep(tempoEspera);

        WebElement campoPesquisa = driver.findElement(By.xpath(mensagem));
        campoPesquisa.sendKeys("Transferencia");

        driver.findElement(By.xpath(ConfirmaPesquisa)).click();
        Thread.sleep(tempoEspera);

        //Pesquisa sem erro ortográfico
        driver.findElement(By.xpath(Logo)).click();
        Thread.sleep(tempoEspera);

        driver.findElement(By.xpath(LupaDePesquisa)).click();
        Thread.sleep(tempoEspera);

        Thread.sleep(tempoEspera);
        driver.findElement(By.xpath(BarraDePesquisa)).click();
        Thread.sleep(tempoEspera);

        driver.findElement(By.xpath(mensagem2)).sendKeys("transferência");
        Thread.sleep(tempoEspera);

        driver.findElement(By.xpath(ConfirmaPesquisa)).click();
        Thread.sleep(tempoEspera);

        // Rolagem automática de scroll
        Thread.sleep(tempoEspera);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 650)");


    }

}