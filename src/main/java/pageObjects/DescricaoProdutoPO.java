package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DescricaoProdutoPO {

    private WebDriver driver;

    public DescricaoProdutoPO(WebDriver driver){
        this.driver = driver;
    }

    public void clicarNaVoltagem(){
        driver.findElement(voltagem110).click();
    }

    private By voltagem110 = By.xpath("//span[@type='Voltagem' and text()='110 volts']");
}
