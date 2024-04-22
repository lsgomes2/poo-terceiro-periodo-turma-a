package BIM1.Lista5Lojas;

    import java.util.Scanner;

public class Vendedor
{
    Scanner scanner = new Scanner(System.in);


        private String nome;
        private int idade;
        private String loja;
        private String cidade;
        private String bairro;
        private String rua;
        private float salarioBase;
        private float[] salarioRecebido;
        private float bonus;
        private float media;


        public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, float salarioBase,
                float[] salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.salarioBase = salarioBase;
            this.salarioRecebido = salarioRecebido;
            this. bonus=0;
            this. media=0;
        }


        public void apresentarse()
        {
            System.out.println("Me chamo " + nome + " tenho " + idade + "anos," + " sou da loja "+ loja + "\n");


            return;
        }
        public void calcularMedia()
        {
            this.media=0;
            for (int i=0; i<this.salarioRecebido.length; i++){
                this.media += this.salarioRecebido[i];
            }
            this.media = ( this.media / this.salarioRecebido.length );
            System.out.printf("A média de salários é R$ %.2f", this.media , "\n" );
        }


        public float calcularBonus()
        {
            this.bonus = ( this.salarioBase * 0.2f );
            System.out.printf("O bônus é R$ %.2f ", this.bonus , "\n");
            return this.bonus;
        }
       
}
