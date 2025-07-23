package loja.modulos.cliente;

public class ListaCliente{

  private Cliente[] clientes;
  private int proximaPosicaoLivre;
  
  public ListaCliente(int capacidade) {
    this.clientes = new Cliente[capacidade];
    this.proximaPosicaoLivre = 0;
  }
  
  public void adicionarCliente(Cliente cliente){
      if (proximaPosicaoLivre < clientes.length) {
          this.clientes[proximaPosicaoLivre] = cliente;
          this.proximaPosicaoLivre++;
      } else {
          System.out.println("Erro: A lista de clientes está cheia!");
      }
  }
  
  
  public Cliente encontrarCliente(int indice){
    for (int i = 0; i < this.proximaPosicaoLivre; i++) {
      Cliente clienteAtual = this.clientes[i];
      int idClienteAtual = clienteAtual.getId();
      if (indice == idClienteAtual){
        return clienteAtual;
      } 
      else continue;
    }
    return null;
  }
  
  public void consultarListaClientes(){
    if (this.proximaPosicaoLivre == 0) {
        System.out.println("Nenhum cliente cadastrado no momento.");
        return;
    }
    System.out.println("Lista de Informações dos Clientes: ");
    System.out.println("-------------------------");  
    
    
    for (int i = 0; i < this.proximaPosicaoLivre; i++) {
        Cliente clienteAtual = this.clientes[i];
        String tipoPessoa = clienteAtual.getTipoPessoa();
        System.out.println("- Id: " + clienteAtual.getId());
        System.out.println("- Nome: " + clienteAtual.getNome());
        System.out.println("- Endereço: " + clienteAtual.getEndereco());
        System.out.println("- Telefone: " + clienteAtual.getTelefone());
        

        if (tipoPessoa.equals("PF")) {
            PessoaFisica pf = (PessoaFisica) clienteAtual;
            System.out.println("- CPF: " + pf.getCPF());

        } else if (tipoPessoa.equals("PJ")) {
            PessoaJuridica pj = (PessoaJuridica) clienteAtual;
            System.out.println("- CNPJ: " + pj.getCNPJ());
        }

        System.out.println("-------------------------------------");
    }
  }
  
  public void consultarCliente(Cliente cliente){

    if (cliente == null) {
      System.out.println("Cliente inválido.");
      return;
    }
    System.out.println("Informações do Cliente " + cliente.getNome());
    System.out.println("- Id: " + cliente.getId());
    System.out.println("- Endereço: " + cliente.getEndereco());
    System.out.println("- Telefone: " + cliente.getTelefone());
  }
}
