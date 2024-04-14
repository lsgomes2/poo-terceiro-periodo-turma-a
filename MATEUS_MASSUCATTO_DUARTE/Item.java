public class Item 
{
    int id;
    String nome;
    String tipo;
    double valor;

    void gerarDescricao()
    {
        System.out.println("Id: " + id + " Nome: " + nome + " Tipo: " + tipo + "Valor: " + valor);
    }
}
