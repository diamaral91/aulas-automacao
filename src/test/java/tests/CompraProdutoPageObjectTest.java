package tests;

import org.testng.annotations.Test;
import pageObjects.BuscaProdutoPO;
import pageObjects.HomePO;
import support.TestBase;

public class CompraProdutoPageObjectTest extends TestBase {

    @Test
    public void comprarProduto(){
        HomePO home = new HomePO(driver);
        BuscaProdutoPO buscaProduto = home.buscarProduto("aquecedor");
    }
}
