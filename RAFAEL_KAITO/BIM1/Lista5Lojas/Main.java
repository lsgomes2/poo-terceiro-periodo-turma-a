package BIM1.Lista5Lojas;

    import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        float[] salarioRecebidoVendedor1 = new float[]{2500f,2550f,2700f};
        float[] salarioRecebidoVendedor2 = new float[]{3000f,3200f,3300f};


        ArrayList<Integer> listaClientes = new ArrayList<>();
        ArrayList<Integer> listaVendedores = new ArrayList<>();

        Endereco EnderecoLoja = new Endereco("PR", "Cascavel", "Centro",
         "Av.Brasil", "222", "Loja");
        Endereco EnderecoVendedor1 = new Endereco("PR", "Cascavel", "Neva",
         "Maranhao", "777", "Casa");
        Endereco EnderecoVendedor2 = new Endereco("PR", "Cascavel", "Pq. Verde",
         "Marechal Rondon", "333", "Casa");
        Endereco EnderecoCliente1 = new Endereco("PR", "Cascavel", "Pq.Sao Paulo", 
        "Rio de Janeiro", "555", "Casa");
        Endereco EnderecoCliente2 = new Endereco("PR", "Cascavel", "Canada",
         "Curitiba", "888", "Casa");
        
        Loja Loja1 = new Loja("MyyPlant", "MyyPlant S.A", "25.725.571/0001-14"
        ,EnderecoLoja,listaClientes,listaVendedores);


        Vendedor Vendedor1 = new Vendedor("Sr.Sandrolaxx", 40, "MyyPlant", EnderecoVendedor1, 2500f, salarioRecebidoVendedor1);
        listaVendedores.add(1);
        Vendedor Vendedor2 = new Vendedor("Sra.Rita", 64, "MyyPlant", EnderecoVendedor2, 3000f, salarioRecebidoVendedor2);
        listaVendedores.add(2);
       
        Cliente Cliente1 = new Cliente("MauroCezar", 27, EnderecoCliente1);
        listaClientes.add(1);
        Cliente Cliente2 =new Cliente("MaestroJunior", 59, EnderecoCliente2);
        listaClientes.add(2);

        System.out.println("\n-------------------");
        System.out.println("\n--- Vendedor 1 ---\n");
        Vendedor1.apresentarse();
        Vendedor1.calcularBonus();
        Vendedor1.calcularMedia();

        System.out.println("\n------------------");
        System.out.println("\n--- Vendedor 2 ---\n");
        Vendedor2.apresentarse();
        Vendedor2.calcularBonus();
        Vendedor2.calcularMedia();

        System.out.println("\n-----------------");
        System.out.println("\n--- Cliente 1 ---\n");
        Cliente1.apresentarse();

        System.out.println("\n-----------------");
        System.out.println("\n--- Cliente 2 ---\n");
        Cliente2.apresentarse();
       
        System.out.println("\n------------------");
        System.out.println("\n--- Loja 1 ---\n");
        Loja1.apresentarse();
        int quantClientes = Loja1.contarClientes();
        int quantVendedores = Loja1.contarVendedores();


        System.out.println("Quantidade de clientes: " + quantClientes);
        System.out.println("Quantidade de vendedores: " + quantVendedores);


    }
}
