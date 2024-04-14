package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

import java.util.Scanner;
import java.util.Date;

public class MyyPlant {

    static Scanner sc = new Scanner(System.in);
    static Date date = new Date();
    static Loja l1;
    static Vendedor v1;
    static Cliente c1;
    static Gerente g1;

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Inserir gerente");
            System.out.println("3 - Inserir vendedor");
            System.out.println("4 - Inserir loja");
            System.out.println("5 - Inserir item");
            System.out.println("6 - Criar pedido");
            System.out.println("Qualquer numero - sair do sistema");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    c1 = insertCustomer();
                    break;

                case 2:
                    g1 = insertManager();
                    break;

                case 3:
                    v1 = insertSeller();
                    break;

                case 4:
                    l1 = insertStore();
                    break;

                case 5:
                    insertItem();
                    break;

                case 6:
                    createOrder(c1, l1, v1);
                    break;

                default:
                    System.out.println("Saindo do sistema...");
                    break;
            }
        } while (option < 7 && option > 0);
    }

    static Cliente insertCustomer() {

        System.out.println("Digite o nome do cliente");
        String name = sc.next();
        System.out.println("Digite a idade do cliente");
        int age = sc.nextInt();
        Cliente c1 = new Cliente(name, age);
        return c1;
    }

    static Gerente insertManager() {
        System.out.println("Digite o nome do gerente");
        String name = sc.next();
        System.out.println("Digite a idade do gerente");
        int age = sc.nextInt();
        System.out.println("Digite o salario do gerente");
        float salary = sc.nextInt();
        Gerente g1 = new Gerente(name, age, salary);
        return g1;
    }

    static Vendedor insertSeller() {
        System.out.println("Digite o nome do vendedor");
        String name = sc.next();
        System.out.println("Digite a idade do vendedor");
        int age = sc.nextInt();
        System.out.println("Digite o salario do vendedor");
        float salary = sc.nextInt();
        Vendedor v1 = new Vendedor(name, age, salary);
        return v1;
    }

    static void insertItem() {
        System.out.println("Digite o nome do produto");
        String name = sc.next();
        System.out.println("Digite o tipo do produto");
        String type = sc.next();
        System.out.println("Digite o ID do produto");
        String id = sc.next();
        System.out.println("Digite o preco do produto");
        float price = sc.nextFloat();
        Item p1 = new Item(name, type, id, price);
    }

    static Loja insertStore() {
        System.out.println("Digite o nome fantasia da loja:");
        String popularName = sc.next();
        System.out.println("Digite a razao social da loja:");
        String socialReason = sc.next();
        System.out.println("Digite o cnpj da loja:");
        String cnpj = sc.next();
        Loja l1 = new Loja(popularName, socialReason, cnpj);
        return l1;
    }

    static void createOrder(Cliente c1, Loja l1, Vendedor v1) {
        System.out.println("Digite o nome do produto");
        String name = sc.next();
        System.out.println("Digite o ID do produto");
        String id = sc.next();
        System.out.println("Digite o preco do produto");
        float price = sc.nextFloat();
        ProcessaPedido o1 = new ProcessaPedido(name, id, price, c1, v1, l1, date, 0, 0);
    }
}
