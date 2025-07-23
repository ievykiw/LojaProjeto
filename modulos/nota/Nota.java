package loja.modulos.nota

import loja.modulos.cliente.Cliente;
import loja.modulos.cliente.ListaCliente;
import loja.modulos.cliente.PessoaFisica;
import loja.modulos.cliente.PessoaJuridica;

import loja.modulos.produtos.CadastroDeProduto;
import loja.modulos.produtos.ListaDeProdutos;
import loja.modulos.produtos.ProdutoDigital;
import loja.modulos.produtos.ProdutoFisico;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Nota{
  
  private int id;
  private Cliente cliente;
  private LocalDateTime data;
  private ListaItens lista[20];
  private static int ultimoId;
  
  public Nota(int id, Cliente cliente, LocalDateTime data, ListaItens lista){
    this.cliente = cliente;
    this.data = data;
    this.lista = lista;
    this.id = obterProximoId();
  }
  
  public void setCliente(Cliente cliente){
    this.cliente = cliente;
  }
  
  public String getClienteNome(){
    return this.cliente.nome;
  }

  public String getClienteTipo(){
    return this.cliente.tipopessoa;
  }
  
  public LocalDateTime getData(){
    return this.data;
  }
  
  public ListaItens getListaItens(){
    return this.lista.consultarListaItens;
  }
  
  public String getIdNota(){
    return this.id;
  }
  
  public static int obterProximoId(){
    ultimoId++;
    return ultimoId;
  }

  public void gerarNota(){
    System.out.println("-----------------------------------");
    System.out.println("|   NOTA N° " + getIdNota() + "   |");
    System.out.println("-----------------------------------\n");
    System.out.println(" Data: " + sdf.format(getData()));
    System.out.println(" Cliente: " + getClienteNome() + " (" + getClienteTipo() + ")\n");
    lista.consultarListaItens();
    //Michael, por favor crie um método para adicionar esta nota numa lista de notas e antes do clear coloque a nota nesta lista. Valeu meu vice da LADATAz
    lista.clear();
    lista = null;
  }
}
