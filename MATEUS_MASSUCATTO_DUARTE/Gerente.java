public class Gerente 
{
    String nomeG;
    int idadeG;
    String loja;
    String cidadeG;
    String bairroG;
    String ruaG;
    int numeroG;
    String complementoG;
    double SalarioBase;
    double SalarioRecebido;

    void apresentarseG()
    {
        System.out.println("Olá, meu nome é: " + nomeG + " tenho " + idadeG + " anos e trabalho na loja " + loja);
    }

    void calcularMediaG()
    {
        System.out.println("Média dos salários: " + (SalarioRecebido / 3));
    }

    void calcularBonusG()
    {
        System.out.println("O bonus é: " + (SalarioBase * 0.35));
    }
}
