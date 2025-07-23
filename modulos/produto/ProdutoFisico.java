package loja.modulos.produto;
import java.math.BigDecimal;

public class ProdutoFisico extends CadastroDeProduto{
        private String marca;
        private String perecivel;

        public ProdutoFisico(String nomeProduto, BigDecimal precoBaseProduto, int estoqueProduto, String marcaProduto, String perecivelProduto) {
            super(nomeProduto, precoBaseProduto, estoqueProduto,"Produto fisico");
            this.marca = marcaProduto;
            this.perecivel = perecivelProduto;
        }
        public void setMarca(String marca){
            this.marca = marca;
        }
        public String getDetalhes() {
            return "Marca: " + marca + "\nperecivel: " + perecivel;
        }
        public String getTipo() {
            return "Produto Fisico";
        }
}
