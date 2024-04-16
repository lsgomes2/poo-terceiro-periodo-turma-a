package MyyPlantaula6;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, int idade, Loja string, String cidade, String bairro, String rua, double salarioBase) {
        super(nome, idade, string, cidade, bairro, rua, salarioBase);
    }

    // Construtor para instância de Gerente com referência a uma Loja
    public Gerente(String nome, int idade, Loja loja, String rua, double salarioBase) {
        super(nome, idade, loja, loja.getCidade(), loja.getBairro(), rua, salarioBase);
    }

 

    public Gerente(String nome, int idade, String string, String cidade, String bairro, String rua,
            double salarioBase) {
        
    }

    @Override
    public double calcularBonus() {
        
        return salarioBase * 0.35;
    }

    public void adicionarSalario(double d) {
        
        throw new UnsupportedOperationException("Unimplemented method 'adicionarSalario'");
    }
}
