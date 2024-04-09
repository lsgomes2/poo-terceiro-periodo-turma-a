public class Vendedor 
{
    String nomeV;
    int idadeV;
    String loja;
    String cidadeV;
    String bairroV;
    String ruaV; 
    double SalarioBase;
    double SalarioRecebido;

    void apresentarseV()
    {
        System.out.println("Ola, meu nome é " + nomeV + " tenho " + idadeV + " anos " + "e trabalho na loja " + loja);
    }

    void calcularMedia()
    {
        System.out.println("Média dos salários: " + (SalarioRecebido / 3));
    }

    void calcularBonus()
    {
        System.out.println("O bonus é: " + (SalarioBase * 0.2));
    }
}
