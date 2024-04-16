// 4. Criar uma classe Item com:
// - Atribuitos id, nome, tipo, valor.
// - Método gerarDescricao, printa o id do item, nome, tipo e valor.

public class Item {
    
    private Integer id;
    private String nome;
    private String tipo;
    private double valor;

    void gerarDescricao(){
        System.out.println("===================================");
        System.out.printf("ID: %s - Nome: %s - Tipo: %s - R$: %s%n ", id, nome, tipo, valor);
        System.out.println("===================================");
    }
}
