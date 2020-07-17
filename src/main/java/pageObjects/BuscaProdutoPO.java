package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaProdutoPO {

    private WebDriver driver;

    public BuscaProdutoPO(WebDriver driver){
        this.driver = driver;
    }

    public DescricaoProdutoPO clicarNoProduto(){
        driver.findElement(aquecedorMondial).click();
        return new DescricaoProdutoPO(driver);
    }

    private By aquecedorMondial = By.xpath("//h2[text()='A-05 Aquecedor Termo Ceramic  Mondial']");
}
