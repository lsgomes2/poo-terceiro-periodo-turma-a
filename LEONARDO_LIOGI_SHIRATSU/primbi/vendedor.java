package primbi;

public class vendedor {

    String nome;
    int idade;
    String loja;
    String cidade;
    String bairro;
    String Rua;
    double salarioBase;
    double[] salarioRecebido = {150,300,150};

  

    void apresentarse(){
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos e trabalho na " + loja);
    }
    
    void calcularMedia(){

        int sum = 0;
        
        for (int i = 0; i < salarioRecebido.length; i++){

            sum += salarioRecebido[i];

        }

        Double avg = (double) (sum / salarioRecebido.length);

        System.out.println("Salário recebido : " + sum );
        System.out.println("Média do salário : " + avg);
    }

    void calcularBonus(){

        double Bonus = salarioBase* 0.2;

        System.out.println("Bonus : " + Bonus);
    }
}
