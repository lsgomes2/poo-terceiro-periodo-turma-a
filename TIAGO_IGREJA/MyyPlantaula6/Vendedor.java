package MyyPlantaula6;

import java.util.ArrayList;

public class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido;

    // Construtor para Vendedor com atributos diretos
    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
        this.salarioRecebido.add(1500.0);
        this.salarioRecebido.add(1600.0);
        this.salarioRecebido.add(1700.0);
    }

    // Construtor para Vendedor com referência a uma Loja
    public Vendedor(String nome, int idade, Loja loja, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja.getNome();
        loja.getCidade();
        loja.getBairro();
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
        this.salarioRecebido.add(1500.0);
        this.salarioRecebido.add(1600.0);
        this.salarioRecebido.add(1700.0);
    }

    // Método para apresentar informações do Vendedor
    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    // Método para calcular a média dos salários recebidos
    public double calcularMedia() {
        double soma = 0;
        for (Double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.size();
    }

    // Método para calcular o bônus do Vendedor
    public double calcularBonus() {
        return salarioBase * 0.2;
    }

    // Método para adicionar um novo salário recebido
    public void adicionarSalario(double salario) {
        salarioRecebido.add(salario);
    }

    // Métodos getters e setters
    // ...
}
