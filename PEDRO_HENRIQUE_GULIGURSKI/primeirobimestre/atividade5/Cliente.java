package primeirobimestre.atividade5;

public class Cliente {
    
    private String nome;
    private Integer idade;
    @SuppressWarnings("unused")
    private String[] endereco = new String[3]; //0 - cidade, 1 - bairro, 2 - rua

    public Cliente(String nome, Integer idade, String[] endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void apresentarse() {
        String msg = "Olá, me chamo "
                .concat(nome)
                .concat(" e tenho ")
                .concat(idade + " anos.");
        System.out.println(msg);
    }

}
