package MyyPlantaula6;

public class Loja {
    // Instância única da Loja
    private static Loja instance;

    // Construtor privado para evitar instanciação direta
    private Loja() {
        // Você pode inicializar atributos aqui, se necessário
    }

    // Método para obter a instância única da Loja
    public static Loja getInstance() {
        
        if (instance == null) {
            instance = new Loja();
        }
        return instance;
    }

    public String getCidade() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getCidade'");
    }

    public String getBairro() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getBairro'");
    }

    public String getNome() {
      
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }

    // Métodos e atributos da Loja...
}
