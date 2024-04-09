package primbi.Lista5;

public class loja {
    //Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.

    String nome;
    String razaosocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    double[] quantVendedores = {21,30,22};
    double quantClientes[] = {2,3,3,3,3};


    void apresentarSe() {
        System.out.println("\nNome Fantasia: " + nome + "\nCNPJ: " + cnpj +
                "\nEndereço: " + cidade + ", " + bairro + ", " + rua);
    }

    void contarClientes() {
        System.out.println("Quantidade de clientes: " + quantClientes.length);
    }

    void contarVendedores(){

        System.out.println("Quantidade de vendedores: " + quantVendedores.length);

    }
}
