package loja.modulos.nota

public class ItemNota {
	private Produto produto;
	private int quantidade;

	public ItemNota(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public BigDecimal getSubtotal(){
		return (produto.getPreco()) * (this.quantidade);
	}

	public Produto getProduto(){
		return this.produto;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
}
