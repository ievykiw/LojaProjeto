package loja.modulos.nota

import java.math.BigDecimal;
import loja.modulos.produto.CadastroDeProduto;

public class ListaItens{

  private ItemNota[] itens;
  private int proximaPosicaoLivre;
  private BigDecimal total;
  private boolean contemProdutoDigital = false;
  
  public ListaItens(int capacidade) {
    this.itens = new ItemNota[capacidade];
    this.proximaPosicaoLivre = 0;
    this.total = BigDecimal.valueOf(0.00);
  }

  public BigDecimal getTotal() {
    return this.total;
  }
  
  public void adicionarItem(ItemNota item){
      if (proximaPosicaoLivre < itens.length) {
          this.itens[proximaPosicaoLivre] = item;
          this.proximaPosicaoLivre++;
      } else {
          System.out.println("Erro: A lista de itens está cheia!");
      }
  }
  
  public void consultarListaItens(){
    if (this.proximaPosicaoLivre == 0) {
        System.out.println("Nenhum item presente na lista no momento.");
        return;
    }
    System.out.println("Lista de Itens: ");
    System.out.println("----------------");  
    
    
    for (int i = 0; i < this.proximaPosicaoLivre; i++) {
        ItemNota itemAtual = this.itens[i];
        Produto produto = itemAtual.getProduto();
        String tipoItem = produto.getTipoProduto();
        System.out.println("- " + itemAtual.produto.getNomeProduto() + "x" + itemAtual.getQuantidade() + ". . . . . R$" + itemAtual.getSubtotal()\n);
        this.total += itemAtual.getSubtotal();

        if (!contemProdutoDigital){
          if(tipoItem.equals("Digital")){
            contemProdutoDigital = true;
          }
        }
    }

    System.out.println("-------------------------------------");

    if (contemProdutoDigital) {
            System.out.println("- Frete: R$20.00\n");
            this.total += BigDecimal.valueOf(20.00);
        }
    
    System.out.println("- Total: " + getTotal()\n);
    System.out.println("-------------------------------------");
  }
}
