package KAUA_MATHEUS.primeiro_bimestre;

import java.util.ArrayList;

public class Vendedor {

    /*String cidade,
    String bairro, String rua, float salarioBase, 
    
    this.cidade = cidade;
    this.bairro = bairro; this.rua = rua; this.salarioBase = salarioBase;
    */

    // Criação de Vars

    String nome;
    int idade;
    Loja loja = new Loja();
    String cidade;
    String bairro;
    String rua;
    float salarioBase;
    float[] salarioRecebido = new float[3];

    public Vendedor(String nome, int idade, float[] salarioRecebido) {


        // Criação de Propriedades
        this.nome = nome; this.idade = idade; 
        this.salarioRecebido = salarioRecebido;

    }


    // Criação de Métodos

    void apresentar() {
        System.out.println("Olá eu me chamo " + this.nome + " e tenho " + this.idade + " anos!");
        System.out.println("E moro em " + this.cidade);
    }

    void calcularMedia(){   
        System.out.println(salarioRecebido[1]);
    }

    void calcularBonus(){   
        System.out.println(this.salarioBase);
    }

    int teste(){
        System.out.println(10);
        return 10;
    }

}
