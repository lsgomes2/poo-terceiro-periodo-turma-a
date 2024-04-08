package HEITOR_FOLTRAN.primeirobi.atividades.lista5;

public class Vendedor {
    
    String nome, loja, cidade, bairro, rua;
    int salarioBase, idade;
    int[] salarioRecebido = new int[3];

    public Vendedor (String nome, String loja, String cidade, String bairro, String rua, int salarioBase, int idade, int[] salarioRecebido){
        this.nome = nome;
        this.loja = loja;
        this.idade = idade;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarSe() {
        System.out.println("Nome do vendedor: " + this.nome + "\nIdade: " + this.idade);
        System.out.println("Loja: " + this.loja);
    }

    public double calcularMedia() {
        double soma = 0;
        for (int salario : this.salarioRecebido) {
            soma += salario;
        }
        return soma / this.salarioRecebido.length;
    }

    public double calcularBonus() {
        return this.salarioBase * 0.2;
    }
}