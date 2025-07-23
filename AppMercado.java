package loja;

import java.util.Scanner;
import java.math.BigDecimal;

import loja.modulos.cliente.Cliente;
import loja.modulos.cliente.ListaCliente;
import loja.modulos.cliente.PessoaFisica;
import loja.modulos.cliente.PessoaJuridica;

import loja.modulos.produto.CadastroDeProduto;
import loja.modulos.produto.ListaDeProdutos;
import loja.modulos.produto.ProdutoDigital;
import loja.modulos.produto.ProdutoFisico;

import loja.ui.ConsoleMenu;


public class AppMercado{
  public static void main(String[] args){
    
    ConsoleMenu interfaceUser = new ConsoleMenu();
    Scanner sc = new Scanner(System.in);
    ListaCliente listaTotal = new ListaCliente(20);
    ListaCliente listaPF = new ListaCliente(20);
    ListaCliente listaPJ = new ListaCliente(20);

    ListaDeProdutos listatotalP = new ListaDeProdutos();

    
    while (true) {
    
      interfaceUser.interfaceMenu();
      String entrada = sc.nextLine();
      
      if (entrada.equals("1")){
      
        interfaceUser.interfaceCadastroProduto();
        String tipoCadastro = sc.nextLine();

          if(tipoCadastro.equals("1")){

              System.out.println("Digite o nome do Produto: ");
              String nome = sc.nextLine();

              System.out.println("Digite o Preço Base do Produto : ");

              BigDecimal precoBase = sc.nextBigDecimal();
              sc.nextLine();

              System.out.println("Digite a quantidade em estoque : ");
              int estoque = sc.nextInt();
              sc.nextLine();

              System.out.println("Digite a marca do Produto : ");
              String marca = sc.nextLine();

              System.out.println("Digite se é perecível\n 0. Não\n 1. Sim: ");
              String perecivel = sc.nextLine();

              if(perecivel.equals("0")){

                  ProdutoFisico newProdutoFisico = new ProdutoFisico(nome, precoBase,estoque,marca,"Não");
                  listatotalP.setLista(newProdutoFisico);
                  listatotalP.getListaFisicos();

              }else{

                  ProdutoFisico newProdutoFisico = new ProdutoFisico(nome, precoBase,estoque,marca,"Sim");
                  listatotalP.setLista(newProdutoFisico);

                  listatotalP.getListaFisicos();
              }
          }else if(tipoCadastro.equals("2")){

              System.out.println("Digite o nome do Produto: ");
              String nome = sc.nextLine();

              System.out.println("Digite o Preço Base do Produto : ");

              BigDecimal precoBase = sc.nextBigDecimal();
              sc.nextLine();

              System.out.println("Digite a quantidade em estoque : ");
              int estoque = sc.nextInt();
              sc.nextLine();

              System.out.println("Digite o prazo de entrega : ");
              String prazoEntrega = sc.nextLine();

              ProdutoDigital newProdutoDigital = new ProdutoDigital(nome,precoBase,estoque,prazoEntrega);
              listatotalP.setLista(newProdutoDigital);
              listatotalP.getListaDigitais();
          }
          continue;

      } else if (entrada.equals("3")) {
      
          interfaceUser.interfaceCadastroCliente();
          String tipoCadastro = sc.nextLine();
          
          if (tipoCadastro.equals("1")){
            
            System.out.println("Digite o nome do cliente: ");
            String nome = sc.nextLine();

            System.out.println("Digite o endereco do cliente: ");
            String endereco = sc.nextLine();

            System.out.println("Digite o telefone do cliente: ");
            String telefone = sc.nextLine();

            System.out.println("Digite o CPF do cliente: ");
            String cpf = sc.nextLine();

            String tipopessoa = "PF";
            
            PessoaFisica newUser = new PessoaFisica(nome, endereco, telefone, tipopessoa, cpf);
            
 
            listaTotal.adicionarCliente(newUser);
            listaPF.adicionarCliente(newUser);
            
            listaTotal.consultarListaClientes();
            listaPF.consultarListaClientes();
            
            
          } else if (tipoCadastro.equals("2")){

              System.out.println("Digite o nome do cliente: ");
              String nome = sc.nextLine();

              System.out.println("Digite o endereco do cliente: ");
              String endereco = sc.nextLine();

              System.out.println("Digite o telefone do cliente: ");
              String telefone = sc.nextLine();

              System.out.println("Digite o CNPJ do cliente: ");
              String cnpj = sc.nextLine();

              String tipopessoa = "PJ";
              
              PessoaJuridica newUser = new PessoaJuridica(nome, endereco, telefone, tipopessoa, cnpj);
              
   
              listaTotal.adicionarCliente(newUser);
              listaPJ.adicionarCliente(newUser);
              
              listaTotal.consultarListaClientes();
              listaPJ.consultarListaClientes();
              
          } else {

              System.out.println("Digite uma opção válida!");
              continue;

          }
          
          continue;
          
      } else if (entrada.equals("2")) {
      
          interfaceUser.interfaceEditarProduto();
          listatotalP.getListaTotal();

          System.out.println("Digite o codigo do Produto: ");
          int userSelected = sc.nextInt();
          sc.nextLine();

          CadastroDeProduto produtoAtual = listatotalP.getProdutoFisicoCompleto(userSelected);

          if(produtoAtual != null){
              if(produtoAtual.getTipo().equals("Produto Fisico")){

                  ProdutoFisico produtoFisico = (ProdutoFisico)produtoAtual;
                  System.out.println("O que você deseja alterar?");
                  System.out.println(" 1. Nome\n 2. PrecoBase\n 3. Estoque\n 4. Marca\n");
                  int opcaoSelecionada = sc.nextInt();
                  sc.nextLine();

                  if(opcaoSelecionada == 1){

                      System.out.println("Digite o novo nome do Produto: ");
                      String novoNomeProduto = sc.nextLine();
                      produtoFisico.setNome(novoNomeProduto);
                      produtoFisico.getPrintProduto();
                      continue;

                  }else if(opcaoSelecionada == 2){

                      System.out.println("Digite o novo preço do Produto: ");
                      BigDecimal novoPrecoProduto = sc.nextBigDecimal();
                      sc.nextLine();
                      produtoFisico.setPrecoBase(novoPrecoProduto);
                      produtoFisico.getPrintProduto();
                      continue;

                  }else if(opcaoSelecionada == 3){

                      System.out.println("Digite o novo estoque: ");
                      int novoEstoqueProduto = sc.nextInt();
                      sc.nextLine();
                      produtoFisico.setEstoque(novoEstoqueProduto);
                      produtoFisico.getPrintProduto();
                      continue;

                  }else if(opcaoSelecionada == 4){

                      System.out.println("Digite a nova marca: ");
                      String novaMarcaProduto = sc.nextLine();
                      produtoFisico.setMarca(novaMarcaProduto);
                      produtoFisico.getPrintProduto();
                      continue;
                  }
              }else{

                  ProdutoDigital produtoDigital = (ProdutoDigital) produtoAtual;
                  System.out.println("O que você deseja alterar?");
                  System.out.println(" 1. Nome\n 2. Preco Base\n 3. Estoque\n 4. Prazo de Entrega");
                  int opcaoSelecionada = sc.nextInt();
                  sc.nextLine();

                  if(opcaoSelecionada == 1){

                      System.out.println("Digite o novo nome do Produto: ");
                      String novoNomeProduto = sc.nextLine();
                      produtoDigital.setNome(novoNomeProduto);
                      produtoDigital.getPrintProduto();
                      continue;

                  }else if(opcaoSelecionada == 2){

                      System.out.println("Digite o novo preço do Produto: ");
                      BigDecimal novoPrecoProduto = sc.nextBigDecimal();
                      sc.nextLine();
                      produtoDigital.setPrecoBase(novoPrecoProduto);
                      produtoDigital.getPrintProduto();
                      continue;

                  } else if(opcaoSelecionada == 3){

                      System.out.println("Digite o novo estoque: ");
                      int novoEstoqueProduto = sc.nextInt();
                      sc.nextLine();
                      produtoDigital.setEstoque(novoEstoqueProduto);
                      produtoDigital.getPrintProduto();
                      continue;

                  }else if(opcaoSelecionada == 4){

                      System.out.println("Digite o novo Prazo de Entrega: ");
                      String novoPrazoDeEntregaDoProduto = sc.nextLine();
                      produtoDigital.setPrazoDeEntrega(novoPrazoDeEntregaDoProduto);
                      produtoDigital.getPrintProduto();
                      continue;
                  }
              }
          }else{
              System.out.println("NAO EXISTE ESSE PRODUTO!");
          }
          continue;
          
      } else if (entrada.equals("4")) {
          interfaceUser.interfaceEditarCliente();
          listaTotal.consultarListaClientes();
          String idClienteConsulta = sc.nextLine();
          
          
          if( idClienteConsulta.matches("\\d+") ) {
            System.out.println("Buscando Usuário...");
            
            int idNumerico = Integer.parseInt(idClienteConsulta);
            Cliente clienteEncontrado = listaTotal.encontrarCliente(idNumerico);
            System.out.println("Selecione o cliente comprador: [DIGITE O ID DO CLIENTE]\n");
            int idClienteEncontrado = clienteEncontrado.getId();
            
            if (clienteEncontrado.getTipoPessoa().equals("PF")){
              PessoaFisica clienteAtualPF = (PessoaFisica) clienteEncontrado;
              System.out.println("O que você deseja alterar?");
              System.out.println(" 1. Nome\n 2. Endereco\n 3. Telefone\n 4. CPF");
              String opcaoSelecionada = sc.nextLine();
              
              if (opcaoSelecionada.equals("1")){
                
                System.out.println("Digite o novo nome do cliente: ");
                String novoNome = sc.nextLine();
                clienteAtualPF.setNome(novoNome);
                continue;
              
              } else if (opcaoSelecionada.equals("2")){
                  
                  System.out.println("Digite o novo endereco do cliente: ");
                  String novoEndereco = sc.nextLine();
                  clienteAtualPF.setEndereco(novoEndereco);
                  continue;
                  
              } else if (opcaoSelecionada.equals("3")){
              
                  System.out.println("Digite o novo telefone do cliente: ");
                  String novoTelefone = sc.nextLine();
                  clienteAtualPF.setTelefone(novoTelefone);
                  continue;
                  
              } else if (opcaoSelecionada.equals("4")){
                  
                  System.out.println("Digite o novo CPF do cliente: ");
                  String novoCPF = sc.nextLine();
                  clienteAtualPF.setCPF(novoCPF);
                  continue;
                  
              } else { 
                  System.out.println("Digite uma opção válida!");
                  continue;
              }
          
          } else if (clienteEncontrado.getTipoPessoa().equals("PJ")){
              
              PessoaJuridica clienteAtualPJ = (PessoaJuridica) clienteEncontrado;
              System.out.println("O que você deseja alterar?");
              System.out.println(" 1. Nome\n 2. Endereco\n 3. Telefone\n 4. CPF");
              String opcaoSelecionada = sc.nextLine();
              
              if (opcaoSelecionada.equals("1")){
              
                System.out.println("Digite o novo nome do cliente: ");
                String novoNome = sc.nextLine();
                clienteAtualPJ.setNome(novoNome);
                continue;
                
              } else if (opcaoSelecionada.equals("2")){
                  
                  System.out.println("Digite o novo endereco do cliente: ");
                  String novoEndereco = sc.nextLine();
                  clienteAtualPJ.setEndereco(novoEndereco);
                  continue;
                  
              } else if (opcaoSelecionada.equals("3")){
                  
                  System.out.println("Digite o novo telefone do cliente: ");
                  String novoTelefone = sc.nextLine();
                  clienteAtualPJ.setTelefone(novoTelefone);
                  continue;
                  
              } else if (opcaoSelecionada.equals("4")){
                  
                  System.out.println("Digite o novo CNPJ do cliente: ");
                  String novoCNPJ = sc.nextLine();
                  clienteAtualPJ.setCNPJ(novoCNPJ);
                  continue;
                  
              } else { 
                  System.out.println("Digite uma opção válida!");
                  continue;
              }
            }
          continue;
          } else {
            System.out.println("Digite um usário válido!");
            continue;
          }
          
      } else if (entrada.equals("5")) {
      
          interfaceUser.interfaceCriarNotaCliente();
          continue;
          
      } else if (entrada.equals("6")) {
      
          interfaceUser.interfaceListarNotas();
          continue;
          
      } else if (entrada.equals("7")) {
      
          interfaceUser.interfaceListarProdutos();
          listatotalP.getListaTotal();
          continue;
          
      } else if (entrada.equals("8")) {
      
          interfaceUser.interfaceListarClientes();
          listaTotal.consultarListaClientes();
          continue;
          
      } else if (entrada.equals("0")) {
      
          return;
          
      } else {
      
        System.out.println("Digite uma opção válida!");
        continue;
        
      }
    }
  }
}
