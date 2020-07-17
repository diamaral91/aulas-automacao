package tests;

import org.testng.annotations.Test;
import pageObjects.BuscaProdutoPO;
import pageObjects.DescricaoProdutoPO;
import pageObjects.HomePO;
import support.TestBase;

public class CompraProdutoPageObjectTest extends TestBase {

    @Test
    public void comprarProduto(){
        // acessar tela de home
        HomePO home = new HomePO(driver);

        // da busca pelo produto, entra na tela das opções de aquecedor (BuscaProdutoPO)
        BuscaProdutoPO buscaProduto = home.buscarProduto("aquecedor");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // do clica no modelo do aquecedor, vai para  descrição do mesmo
        DescricaoProdutoPO descricaoProduto = buscaProduto.clicarNoProduto();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // dentro da tela de descricao do aquecedor, seleciona a voltagem
        descricaoProduto.clicarNaVoltagem();

        // clicar escolha da loja

        // clicar no comprar
    }
}
