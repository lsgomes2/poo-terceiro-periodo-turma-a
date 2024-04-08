package primeirobi.Floricultura4;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    Integer cnpj;
    String cidade;
    String bairro;
    String rua;
    String [] vendedores = new String[20];
    String [] clientes = new String[20];
 
    public void contarClientes(){
        int contador=0;
        for(int i=0;i<clientes.length;i++){
            if(clientes[i]!=null){
                contador++;
            }
        }
        System.out.println("A loja possui "+contador+" clientes.");
    }
    public void contarVendedores(){
        int contador=0;
        for(int i=0;i<vendedores.length;i++){
            if(vendedores[i]!=null){
                contador++;
            }
        }
        System.out.println("A loja possui "+contador+" vendedores.");
    }

    public void apresentarse(){
        System.out.println("A loja "+nomeFantasia+" esta localizada na rua "+rua+", "+bairro+", "+cidade+".");
    }
}
/*Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
contarClientes, mosta a quantidade de clientes
contarVendedores, mosta a quantidade de vendedores.
Método apresentarse, printa nomeFantasia, cnpj e endereco.*/