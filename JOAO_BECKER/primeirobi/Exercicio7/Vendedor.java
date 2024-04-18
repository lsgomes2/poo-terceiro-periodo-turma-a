package primeirobi.Exercicio7;

public class Vendedor {
    
    private String nome;
    private Integer idade;
    private String loja;
    private String cidade;
    private String bairro;
    private String rua;
    private Double salarioBase;
    private Double [] salarioRecebido = new Double[3];
    private Endereco endereco;

    public Vendedor(String nome, Integer idade, String loja, String cidade, String bairro, String rua,Double salarioBase, Double[] salarioRecebido, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(Double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
