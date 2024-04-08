package primeirobi.Floricultura4;

public class teste {
    public static void main(String[] args) {
        Loja lojaUm =  new Loja();

        lojaUm.nomeFantasia="roupa e cia";
        lojaUm.rua="1";
        lojaUm.bairro="centro";
        lojaUm.cidade="cascavel";
        lojaUm.apresentarse();
        lojaUm.clientes[2]="jose";
        lojaUm.vendedores[15]="marcos";
        lojaUm.contarClientes();
        lojaUm.contarVendedores();
    }
    
}
