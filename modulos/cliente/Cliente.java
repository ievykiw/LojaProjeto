package loja.modulos.cliente;

public class Cliente{
  
  private int id;
  private String nome;
  private String endereco;
  private String telefone;
  private String tipopessoa;
  private static int ultimoId;
  
  public Cliente(String nome, String endereco, String telefone, String tipopessoa){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.tipopessoa = tipopessoa;
    this.id = obterProximoId();
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
  
  public void setTipoPessoa(String tipopessoa){
    this.tipopessoa = tipopessoa;
  }
  
  public String getTipoPessoa(){
    return this.tipopessoa;
  }
  
  public String getNome(){
    return this.nome;
  }
  
  public String getEndereco(){
    return this.endereco;
  }
  
  public String getTelefone(){
    return this.telefone;
  }
  
  public int getId(){
    return this.id;
  }
  
  public static int obterProximoId(){
    ultimoId++;
    return ultimoId;
  }
}
