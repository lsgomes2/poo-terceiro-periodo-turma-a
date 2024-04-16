package atividades1B;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da Loja
        Loja loja = new Loja("plantao 4:20", "Plantao Ltda.", "123.456.789/0001-00", "São Paulo", "Centro", "Rua Principal");

        // Criando instâncias de Vendedor
        double[] salarioLancamentosVendedor1 = {3000.0, 3200.0, 3500.0};
        Vendedor vendedor1 = new Vendedor("Pedro Santos", 35, loja, "São Paulo", "Mooca", "Rua 123", salarioLancamentosVendedor1, 3000.0);

        double[] salarioLancamentosVendedor2 = {2500.0, 2800.0, 3000.0};
        Vendedor vendedor2 = new Vendedor("Ana Lima", 28, loja, "São Paulo", "Mooca", "Rua 123", salarioLancamentosVendedor2, 2500.0);

        // Criando instâncias de Cliente
        Cliente cliente1 = new Cliente("João Silva", 30, "São Paulo", "Centro", "Rua ABC");
        Cliente cliente2 = new Cliente("Maria Souza", 25, "Rio de Janeiro", "Leblon", "Rua XYZ");

        // Adicionando os vendedores à loja
        loja.adicionarVendedor(vendedor1);
        loja.adicionarVendedor(vendedor2);

        // Exibindo informações da loja
        System.out.println("Informações da Loja:");
        loja.apresentarSe();
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());

        // Exibindo informações dos vendedores
        System.out.println("\nInformações dos Vendedores:");
        vendedor1.apresentarSe();
        System.out.println("Média de salários: " + vendedor1.calcularMedia());
        System.out.println("Bônus: " + vendedor1.calcularBonus());

        vendedor2.apresentarSe();
        System.out.println("Média de salários: " + vendedor2.calcularMedia());
        System.out.println("Bônus: " + vendedor2.calcularBonus());

        // Exibindo informações dos clientes
        System.out.println("\nInformações dos Clientes:");
        cliente1.apresentarSe();
        cliente2.apresentarSe();
    }
}
