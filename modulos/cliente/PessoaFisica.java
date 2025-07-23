package loja.modulos.cliente;

public class PessoaFisica extends Cliente{

    private String cpf;

  public PessoaFisica(String nome, String endereco, String telefone, String tipopessoa, String cpf){
    super(nome, endereco, telefone, tipopessoa);
    this.cpf = cpf;
  }

  public void setCPF(String cpf){
    this.cpf = cpf;
  }

  public String getCPF(){
    return this.cpf;
  }
} 
