package primeirobimestre.atividade5;

public class MyyPlant {
    
    public static void main(String[] args) {

        // Criar clientes
        String[] enderecoCliente1 = {"Cascavel", "Brasmadera", "Rua Maguari"};
        String[] enderecoCliente2 = {"Toledo", "Barras Moles", "Rua Ariovaldo"};
        Cliente cliente1 = new Cliente("Raul Kaito", 43, enderecoCliente1);
        Cliente cliente2 = new Cliente("Heitor Massucato", 19, enderecoCliente2);

        // Criar vendedor 
        String[] enderecoVendedor1 = {"Cascavel", "Santa Felicidade", "Rua Clodoaldo"};
        Float[] salarioRecebidoVend1 = {2400.00f, 1800.00f, 1904.99f};
        String[] enderecoVendedor2 = {"Quedas do Iguaçu", "Talita", "Rua Mamata"};
        Float[] salarioRecebidoVend2 = {1150.50f, 1500.00f, 2000.50f};
        Vendedor vendedor1 = new Vendedor("Pedro Henrique", 19, "MyyPlant",enderecoVendedor1, 2300.00f, salarioRecebidoVend1);
        Vendedor vendedor2 = new Vendedor("Gabriel Toledo", 32, "MyyPlant", enderecoVendedor2, 2300.00f, salarioRecebidoVend2);

        // Criando loja
        String[] enderecoLoja = {"Cascavel", "Santa Felicidade", "Rua Macacos me Mordam"};
        Vendedor[] vendedores = {vendedor1, vendedor2};
        Cliente[] clientes = {cliente1, cliente2};
        Loja loja = new Loja("MyyPlant", "Plantas Gabriela ltda", "94.027.944/0001-04", enderecoLoja, vendedores, clientes);

        // Executar funções loja
        System.out.println("Informações da Loja: ");
        loja.apresentarse();
        System.out.println();

        System.out.println("Informações dos Vendedores: ");
        for (Vendedor vendedor : loja.vendedores) {
            if (vendedor != null) {
                vendedor.apresentarse();  
                vendedor.calcularMedia(); 
                vendedor.calcularBonus();
            }
        }
        System.out.println();

        System.out.println("Informações dos Clientes: ");
        for (Cliente cliente : loja.clientes) {
            cliente.apresentarse();
            
        }
    }

}
