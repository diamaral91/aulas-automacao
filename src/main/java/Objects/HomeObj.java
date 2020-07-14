package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeObj {

    private WebDriver driver;

    public HomeObj(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getProdutoTextField() {
        return driver.findElement(By.id("h_search-input"));
    }
}
