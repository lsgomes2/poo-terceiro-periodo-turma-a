package primerio_bimestre;

public class test2 {
    public static void main(String[] args) {
        int idade = 20;
        int velocidade = 60;

        //System.out.println("Minha idade é: " + idade);
        //System.out.println(idade < 18 ? "É menor" : " Não é menor");

        if (velocidade < 60 && velocidade > 40) {
            System.out.println("Média");
        }

        if (velocidade > 60 && velocidade < 80) {
            System.out.println("Grave");
        }

        if (velocidade > 80 ) {
            System.out.println("Fumo");
        }
    }
}
