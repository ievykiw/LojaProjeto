package loja.modulos.cliente;

public class PessoaJuridica extends Cliente{

    private String cnpj;

  public PessoaJuridica(String nome, String endereco, String telefone, String tipopessoa, String cnpj){
    super(nome, endereco, telefone, tipopessoa);
    this.cnpj = cnpj;
  }

  public void setCNPJ(String cnpj){
    this.cnpj = cnpj;
  }

  public String getCNPJ(){
    return this.cnpj;
  }
} 
