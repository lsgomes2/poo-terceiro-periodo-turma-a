package primeirobimestre.Listas;
import java.util.Scanner;

class Vendedor {
    String nome, cidade, bairro, rua, loja;
    int idade;
    double salarioBase;
    double[] salarioRecebido = new double[3]; // Armazena três valores 

    //Apresentar o vendedor
    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja);
    }

    // Calcula a média dos salários
    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    // Calcula o bônus
    public double calcularBonus() {
        return salarioBase * 0.2;
    }
}

class Cliente {
    String nome, cidade, bairro, rua;
    int idade;

    // Apresenta o cliente
    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Loja {
    String nomeFantasia, razaoSocial, cnpj, cidade, bairro, rua;
    Vendedor[] vendedores;
    Cliente[] clientes;

    // Conta clientes
    public int contarClientes() {
        return clientes.length;
    }

    // Conta vendedores
    public int contarVendedores() {
        return vendedores.length;
    }

    // Apresenta a loja
    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
    }
}

public class listaquatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objeto e preenchendo atributos
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nome = "Sandrolax";
        vendedor1.idade = 26;        vendedor1.loja = " Myy Plants ";
        vendedor1.salarioBase = 2000;
        vendedor1.salarioRecebido = new double[]{2000, 2100, 2200}; // salário

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Maria";
        cliente1.idade = 25;
        cliente1.cidade = "Cascavel";
        cliente1.bairro = "Centro";
        cliente1.rua = "Rua da FAG ";

        Loja loja1 = new Loja();
        loja1.nomeFantasia = " Myy Plants";
        loja1.razaoSocial = "Myy Plants LTDA";
        loja1.cnpj = "12345678/0001-65";
        loja1.cidade = "Cascavel";
        loja1.bairro = "Centro";
        loja1.rua = "Rua da FAG";
        loja1.vendedores = new Vendedor[]{vendedor1};
        loja1.clientes = new Cliente[]{cliente1}; 

        // Chamando as Classe
        vendedor1.apresentarse();
        System.out.println("Média dos salários recebidos: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus());

        cliente1.apresentarse();

        loja1.apresentarse();
        System.out.println("Quantidade de clientes: " + loja1.contarClientes());
        System.out.println("Quantidade de vendedores: " + loja1.contarVendedores());

        scanner.close();
    }
}
