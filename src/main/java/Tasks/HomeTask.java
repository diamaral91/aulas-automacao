package Tasks;

import Objects.HomeObj;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomeTask {

    private HomeObj obj;

    public HomeTask(WebDriver driver){
        obj = new HomeObj(driver);
    }
    public void buscarProduto(String produto) {
        obj.getProdutoTextField().sendKeys(produto, Keys.ENTER);
    }
}
