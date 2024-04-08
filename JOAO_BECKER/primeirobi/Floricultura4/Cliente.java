package primeirobi.Floricultura4;

public class Cliente {
    String nome;
    Integer idade;
    String cidade;
    String bairro;
    String rua;

    public void apresentarse(){
        System.out.println("O cliente "+nome+" tem "+idade+" anos.");
    }
}