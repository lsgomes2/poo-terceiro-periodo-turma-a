package primeirobi.atividades.lista6;

public class Main {
    public static void main(String[] args) {

        Gerente primeiroGerente = new Gerente("Alberto", "Cascavel", "Neva", "Asfaltada", "LudimilosTech", 45, 5000, new double[]{1550, 1500, 2000});
            primeiroGerente.apresentarSe();
            primeiroGerente.calcularMedia();
            primeiroGerente.calcularBonus();

            
        System.out.println("\n--------------------------------\n");


        Endereco primeiroEndereco = new Endereco("Paraná", "Cascavel", "Neva", "Curitiba", 132, "apto. 123");
            primeiroEndereco.apresentarLogadouro();
        

        System.out.println("\n--------------------------------\n");


        Item primeiroItem = new Item(215, "Banana", "Fruta", 2.50);
            primeiroItem.gerarDescricao();


        System.out.println("\n--------------------------------\n");


        Cliente primeiroCliente = new Cliente ("João", "Tupãssi", "Jardim São Paulo", "Primeiro de Janeiro", 19);
            primeiroCliente.apresentarSe();


        System.out.println("\n--------------------------------\n");


        Vendedor segundoVendedor = new Vendedor ("Alberto", "Myy Plant", "Cascavel", "Centro", "São Paulo", 3000, 40, new double[]{4000, 4500, 3000});
            segundoVendedor.apresentarSe();
            segundoVendedor.calcularBonus();
            segundoVendedor.calcularMedia();



    }
}
