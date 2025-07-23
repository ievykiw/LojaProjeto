package loja.ui;

public class ConsoleMenu{

  public void interfaceMenu(){
      System.out.println("----------------------------------------------");
      System.out.println("| Bem-vindo(a) ao Supermercado Pará Lanches! |");
      System.out.println("----------------------------------------------\n");
      System.out.println("Selecione uma das opções abaixo:\n");
      System.out.println(" 1. Cadastrar Produto\n 2. Alterar Produto\n 3. Cadastrar Cliente\n 4. Alterar Cliente\n 5. Criar Nota de Compra\n 6. Listar Notas Emitidas\n 7. Listar Produtos\n 8. Listar Clientes\n 0. Sair\n");
  }
  public void interfaceCadastroProduto(){
      System.out.println("-----------------------");
      System.out.println("| Cadastro de Produto |");
      System.out.println("-----------------------\n");
      System.out.println("Selecione o tipo do produto:\n");
      System.out.println(" 1. Produto Físico\n 2. Produto Digital\n 3. Voltar\n 0. Sair\n");
  }
  
  public void interfaceCadastroCliente(){
      System.out.println("-----------------------");
      System.out.println("| Cadastro de Cliente |");
      System.out.println("-----------------------\n");
      System.out.println("Selecione o tipo do cliente:\n");
      System.out.println(" 1. Pessoa Física\n 2. Pessoa Jurídica\n 3. Voltar\n 0. Sair\n");
  }
  
  public void interfaceEditarProduto(){
      System.out.println("---------------------------");
      System.out.println("| Editar Dados do Produto |");
      System.out.println("---------------------------\n");
      System.out.println("Selecione o produto que deseja editar: [DIGITE O ID DO PRODUTO]\n");
      System.out.println(" LISTA DE PRODUTOS");
  }
  
  public void interfaceEditarCliente(){
      System.out.println("---------------------------");
      System.out.println("| Editar Dados do Cliente |");
      System.out.println("---------------------------\n");
      System.out.println("Selecione o cliente que deseja editar: [DIGITE O ID DO CLIENTE]\n");
      System.out.println(" ---> LISTA DE CLIENTES <--- ");
  }
   
  public void interfaceCriarNotaCliente(){
      System.out.println("------------------------");
      System.out.println("| Criar Nota de Compra |");
      System.out.println("------------------------\n");
      System.out.println(" LISTA DE CLIENTES");
  }
  
  public void interfaceCriarNotaProdutos(){
      System.out.println("Selecione um produto comprado por vez: [DIGITE O ID DO PRODUTO]\n");
      System.out.println(" LISTA DE PRODUTO");
  }
  
  public void interfaceListarNotas(){
      System.out.println("---------------------------");
      System.out.println("| Lista de Notas Emitidas |");
      System.out.println("---------------------------\n");
  }
  
  public void interfaceListarProdutos(){
      System.out.println("---------------------");
      System.out.println("| Lista de Produtos |");
      System.out.println("---------------------\n");
  }
  
  public void interfaceListarClientes(){
      System.out.println("---------------------");
      System.out.println("| Lista de Clientes |");
      System.out.println("---------------------\n");
  }
}
