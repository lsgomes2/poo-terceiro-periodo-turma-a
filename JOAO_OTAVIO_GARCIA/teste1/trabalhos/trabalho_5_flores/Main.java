package trabalho_5_flores;

public class Main {

    public static void main(String[] args) {

        //loja
        Loja Loja_principal = new Loja("My Plant", "My plant Gabriela LTD", "Pato branco", "Centro", "10071048000144", "Cascavel");
        //Clientes
        Cliente Clientes_1 = new Cliente(21, "Sandro", "Cascavel", "Pelicano", "3 de Março");
        Cliente Clientes_2 = new Cliente(21, "Sandra", "Cascavel", "Pelicano", "5 de Março");

        //vendedor
        Vendendor Vendedor_1 = new Vendendor("joao", 19, "Tupãssi", "Pombo", "Janeiro", 
        1800f, "loja Matriz(my plant)");

        Cliente[] Clientes = new Cliente[]{Clientes_1,Clientes_2};
        Vendendor[] Vendedores = new Vendendor[]{Vendedor_1};

        Vendedor_1.apresentarSe();
        Loja_principal.apresentarSe();
    }
    
}
