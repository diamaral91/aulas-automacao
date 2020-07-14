package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * mapeamento de objetos web utilizando page object
 */
public class HomePO {

    private WebDriver driver;

    public HomePO(WebDriver driver){
        this.driver = driver;
    }

    public BuscaProdutoPO buscarProduto(String produto) {
        driver.findElement(busqueAquiSeuProduto).sendKeys(produto, Keys.ENTER);
        return new BuscaProdutoPO(driver);
    }

    private By busqueAquiSeuProduto = By.id("h_search-input");
}
