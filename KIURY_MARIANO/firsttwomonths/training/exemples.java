package firsttwomonths.training;

public class exemples {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int idade = 18;

        String hemaior = idade < 18 ? "É menor" : "Não é menor";

        System.out.println("Minha idade é: " +idade);
        System.out.println(idade < 18 ? "É menor" : "Não é menor");

        int velocidade = 90;

        if (velocidade < 60 & velocidade > 40){

            System.out.println("Média!");
        }
        if (velocidade > 60 && velocidade < 80){

            System.out.println("Grave!");
        }
        if (velocidade > 80){

            System.out.println("Rodou!");
        }
        
        
    }
    
}
