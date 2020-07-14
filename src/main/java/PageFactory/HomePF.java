package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePF {

    private WebDriver driver;

    public HomePF(WebDriver driver){
        this.driver = driver;
    }

    public void buscarProduto(String produto) {
        busqueAquiSeuProduto.sendKeys(produto, Keys.ENTER);
    }

    @FindBy(id = "h_search-input")
    private WebElement busqueAquiSeuProduto;
}
