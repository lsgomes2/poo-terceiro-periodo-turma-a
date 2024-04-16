package MyyPlantaula6;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    protected String nome;
    protected int idade;
    protected Loja loja;
    protected Endereco endereco;
    protected double salarioBase;
    protected List<Double> salariosRecebidos;

    // Construtor para Funcionario com atributos diretos
    public Funcionario(String nome, int idade, Loja loja2, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja2;
        this.endereco = new Endereco("SP", cidade, bairro, rua, ""); // Inicializa o endereco
        this.salarioBase = salarioBase;
        this.salariosRecebidos = new ArrayList<>(); // Inicializa a lista de salários recebidos
        
        // Adiciona alguns salários recebidos para fins de exemplo
        this.salariosRecebidos.add(1500.0);
        this.salariosRecebidos.add(1600.0);
        this.salariosRecebidos.add(1700.0);
    }

    // Método para apresentar informações do Funcionario
    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
        endereco.apresentarLogradouro();
    }

    // Método para calcular a média dos salários recebidos
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salariosRecebidos) {
            soma += salario;
        }
        return soma / salariosRecebidos.size();
    }

    // Método para calcular o bônus do Funcionario
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}
