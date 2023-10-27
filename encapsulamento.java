import java.util.Date;

public class Pessoa{
    protected String nome;
    protected  String cpf;
    protected  String endereco;
    protected  String RG
    protected  Date data_de_nascimento;

public Pessoa(String _nome, String _cpf, String_endereco, String _RG,
    this.nome = _nome;
    this.cpf = _cpf;
    this.endereco = _endereco;
    this.RG = _RG;
    this.data_de_nascimento = _data;
    )
}
public String getNome(){ //pegar o valor de um atributo 
    return nome;
}

public void setNome(String nome) { // alterar o valor deste atributo
    this.nome = nome;
}