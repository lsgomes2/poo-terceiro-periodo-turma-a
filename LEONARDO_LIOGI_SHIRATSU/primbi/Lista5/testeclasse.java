package primbi.Lista5;

public class testeclasse {

    public static void main(String[] args) {
        
        vendedor vendedorUm = new vendedor();

        vendedorUm.nome = "Roberto";
        vendedorUm.idade = 21;
        vendedorUm.loja = "TrabucoStore";
        vendedorUm.salarioBase = (double) 150;
        
        vendedorUm.apresentarse();
        vendedorUm.calcularBonus();
        vendedorUm.calcularMedia();

        cliente clienteUm = new cliente();

        clienteUm.nome = "Carla";
        clienteUm.idade = 54;
        clienteUm.apresentarseCliente();

        loja lojaUm = new loja();

        lojaUm.nome = "TrabucoStore";
        lojaUm.razaosocial = "Compania de Trabucos S.A";
        lojaUm.cnpj = "50.316.130/0001-06";
        lojaUm.cidade = "Cascavel";
        lojaUm.bairro = "Centro";
        lojaUm.rua = "Av. Brasil";



        lojaUm.apresentarSe();
        lojaUm.contarVendedores();
        lojaUm.contarClientes();
    }
    
}
