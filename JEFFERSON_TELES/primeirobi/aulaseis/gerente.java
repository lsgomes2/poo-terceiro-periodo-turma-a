package primeirobi.aulaseis;

import java.util.ArrayList;
import java.util.List;

import primeirobi.Loja;

public class gerente {
    String nome;
    int idade;
    Loja loja;
    endereco endereco;
    double salarioBase;
    List<Double> salarioRecebido;

    public gerente(String nome, int idade, Loja loja, endereco endereco, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.salarioRecebido = new ArrayList<>();
    }

    public void addSalario(double salario) {
        salarioRecebido.add(salario);
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja.getNome());
    }

    public double calcularMedia() {
        double total = 0;
        for (double salario : salarioRecebido) {
            total += salario;
        }
        return total / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }
}
