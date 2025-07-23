package loja.modulos.produto;

public class ListaDeProdutos{
    private CadastroDeProduto lista[] = new CadastroDeProduto[20];
    private int indice = 0;

    public void setLista(CadastroDeProduto produto) {
        this.lista[indice] = produto;
        produto.setCodigo(indice + 1);
        indice++;
    }
    public void getListaTotal(){
        for(int i =0; i<indice; i++){
            System.out.println("Nome: "+lista[i].getNome());
            System.out.println("Tipo: "+lista[i].getTipo());
            System.out.println("Codigo: "+lista[i].getCodigo());
            System.out.println("Preço: "+lista[i].getPrecoBase());
            System.out.println("Quantidade em estoque: "+lista[i].getEstoque());
            System.out.println(lista[i].getDetalhes());
            System.out.println("---------------------------");
        }
    }
    public void getListaFisicos(){
        for(int i =0; i<indice; i++){
            if(lista[i].getTipo().equals("Produto Fisico")) {
                System.out.println("Nome: " + lista[i].getNome());
                System.out.println("Tipo: " + lista[i].getTipo());
                System.out.println("Codigo: " + lista[i].getCodigo());
                System.out.println("Preço: " + lista[i].getPrecoBase());
                System.out.println("Quantidade em estoque: " + lista[i].getEstoque());
                System.out.println(lista[i].getDetalhes());
                System.out.println("---------------------------");
            }
        }
    }
    public void getListaDigitais(){
        for(int i =0; i<indice; i++){
            if(lista[i].getTipo().equals("Produto Digital")) {
                System.out.println("Nome: " + lista[i].getNome());
                System.out.println("Tipo: " + lista[i].getTipo());
                System.out.println("Codigo: " + lista[i].getCodigo());
                System.out.println("Preço: " + lista[i].getPrecoBase());
                System.out.println("Quantidade em estoque: " + lista[i].getEstoque());
                System.out.println(lista[i].getDetalhes());
                System.out.println("---------------------------");
            }
        }
    }
    public CadastroDeProduto getProdutoFisicoCompleto(int codigo){
        for(int i = 0 ; i < indice; i++){
            if(lista[i].getCodigo()==codigo){
                return lista[i];
            }
        }
        return null;
    }
    public CadastroDeProduto getProdutoAlteravel(int i){
        return lista[i];
    }
}
