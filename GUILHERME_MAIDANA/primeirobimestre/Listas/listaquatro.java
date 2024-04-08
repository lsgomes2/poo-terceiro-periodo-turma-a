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
    int[][] vendasDiarias = new int[30][12]; // Matriz de dias e meses

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

    // Registrar venda na loja
    public void registrarVenda(int dia, int mes, int valor) {
        vendasDiarias[dia - 1][mes - 1] += valor; // Subtraindo 1 para ajustar ao índice 0
    }

    // Calcular total de vendas para um determinado dia e mês
    public int calcularTotalVendas(int dia, int mes) {
        return vendasDiarias[dia - 1][mes - 1];
    }

    // Calcular salário do vendedor
    public double calcularSalarioVendedor(Vendedor vendedor) {
        // Calcula a média dos salários recebidos
        double mediaSalarios = vendedor.calcularMedia();
        // Calcula o bônus
        double bonus = vendedor.calcularBonus();
        // Retorna o salário total (média dos salários + bônus)
        return mediaSalarios + bonus;
    }
}

public class listaquatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objeto e preenchendo atributos
        Vendedor vendedor1 = new Vendedor();
        vendedor1.nome = "Sandrolax";
        vendedor1.idade = 26;
        vendedor1.loja = "Myy Plants";
        vendedor1.salarioBase = 2000;
        vendedor1.salarioRecebido = new double[]{2000, 2100, 2200}; // salário

        // Apresenta o vendedor
        System.out.println("Vendedor:");
        vendedor1.apresentarse();
        System.out.println(); // Adiciona uma linha em branco para separar a apresentação do vendedor do menu de opções

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Maria";
        cliente1.idade = 25;
        cliente1.cidade = "Cascavel";
        cliente1.bairro = "Centro";
        cliente1.rua = "Rua da FAG";

        Loja loja1 = new Loja();
        loja1.nomeFantasia = "Myy Plants";
        loja1.razaoSocial = "Myy Plants LTDA";
        loja1.cnpj = "12345678/0001-65";
        loja1.cidade = "Cascavel";
        loja1.bairro = "Centro";
        loja1.rua = "Rua da FAG";
        loja1.vendedores = new Vendedor[]{vendedor1};
        loja1.clientes = new Cliente[]{cliente1};

        // Interação com o usuário
        int menu;

        do {
            System.out.println("Entre com uma opção:");
            System.out.println("1 - Registrar venda");
            System.out.println("2 - Calcular total de vendas para um dia e mês específicos");
            System.out.println("3 - Calcular salário do vendedor");
            System.out.println("4 - Mostrar informações da loja");
            System.out.println("5 - Sair");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o dia do mês (1 a 30), o mês (1 a 12) e o valor da venda:");
                    int diaVenda = scanner.nextInt();
                    int mesVenda = scanner.nextInt();
                    int valorVenda = scanner.nextInt();
                    loja1.registrarVenda(diaVenda, mesVenda, valorVenda);
                    System.out.println("Venda registrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o dia do mês (1 a 30) e o mês (1 a 12) para calcular o total de vendas:");
                    int diaBusca = scanner.nextInt();
                    int mesBusca = scanner.nextInt();
                    System.out.println("Total de vendas para o dia " + diaBusca + " do mês " + mesBusca + ": " +
                            loja1.calcularTotalVendas(diaBusca, mesBusca));
                    break;
                case 3:
                    double salarioVendedor = loja1.calcularSalarioVendedor(vendedor1);
                    System.out.println("Salário do vendedor: R$" + salarioVendedor);
                    break;
                case 4:
                    loja1.apresentarse();
                    System.out.println("Quantidade de clientes: " + loja1.contarClientes());
                    System.out.println("Quantidade de vendedores: " + loja1.contarVendedores());
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (menu != 5);

        scanner.close();
    }
}
