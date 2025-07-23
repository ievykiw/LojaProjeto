package loja.modulos.produto;
import java.math.BigDecimal;

public class ProdutoDigital extends CadastroDeProduto{
    private static BigDecimal frete = new BigDecimal(5.0);
    private String prazoEntrega;

    public ProdutoDigital(String nomeProduto, BigDecimal precoBaseProduto, int estoqueProduto, String prazoEntregaProduto) {
        super(nomeProduto, precoBaseProduto, estoqueProduto,"Produto Digital");
        this.prazoEntrega = prazoEntregaProduto;
    }
    public String getDetalhes() {
        return "Frete: " + frete + "\nPrazo de Entrega: " + prazoEntrega;
    }
    public String getTipo() {
        return "Produto Digital";
    }
    public void setPrazoDeEntrega(String novoPrazo){
        this.prazoEntrega = novoPrazo;
    }
}
