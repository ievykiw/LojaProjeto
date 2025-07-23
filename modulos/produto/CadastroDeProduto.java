package loja.modulos.produto;
import java.math.BigDecimal;

public class CadastroDeProduto{
    private int codigoProduto;
    private String nomeProduto;
    private BigDecimal precoBaseProduto;
    private int estoqueProduto;
    private String tipoProduto;

    public CadastroDeProduto(String nome, BigDecimal precoBase, int estoque,String tipo) {
        this.nomeProduto = nome;
        this.precoBaseProduto = precoBase;
        this.estoqueProduto = estoque;
        this.tipoProduto = tipo;
    }
    
    public void getPrintProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Preço: " + getPrecoBase());
        System.out.println("Quantidade em estoque: " + getEstoque());
        System.out.println(getDetalhes());
        System.out.println("---------------------------");
    }
    public String comprarProduto(int quantidade){
        String indsp = "Quantidade de Estoque Indisponivel";
        String disp = "Compra Concluida";
        int diferencaProdutos = estoqueProduto - quantidade;
        if(diferencaProdutos <= 0){
            return indsp;
        }else{
            setEstoque(diferencaProdutos);
            return disp;
        }
    }
    public void setNome(String nome){
        this.nomeProduto = nome;
    }
    public void setCodigo(int codigo) {
        this.codigoProduto = codigo;
    }
    public void setPrecoBase(BigDecimal precoBase) {
        this.precoBaseProduto = precoBase;
    }
    public void setEstoque(int estoque) {
        this.estoqueProduto = estoque;
    }
    public int getCodigo() {
        return codigoProduto;
    }
    public BigDecimal getPrecoBase() {
        return precoBaseProduto;
    }
    public int getEstoque() {
        return estoqueProduto;
    }
    public String getNome() {
        return nomeProduto;
    }
    public String getTipo(){
        return tipoProduto;
    }
    public String getDetalhes() {
        return "";
    }
}
