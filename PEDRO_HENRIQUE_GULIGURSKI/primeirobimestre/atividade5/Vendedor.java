package primeirobimestre.atividade5;

public class Vendedor {

    private String nome;
    private Integer idade;
    private String loja;
    @SuppressWarnings("unused")
    private String[] endereco = new String[3]; //0 - cidade, 1 - bairro, 2 - rua
    private Float salarioBase;
    @SuppressWarnings("unused")
    private Float[] salarioRecebido = new Float[3];

    

    public Vendedor(String nome, Integer idade, String loja,String[] endereco, Float salarioBase, Float[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }
    
    public void apresentarse() {
        String msg = "Olá, me chamo "
                .concat(nome + " e tenho ")
                .concat(idade + " anos. ")
                .concat("E trabalho na loja ")
                .concat(loja);
        System.out.println(msg);
    }

    public float calcularMedia() {
        Float mediaSalario = salarioBase;
        for (int i = 0; i < 3; i++) {
            mediaSalario += salarioRecebido[i];
        }
        System.out.println("A média de meu salário é "+(mediaSalario / 4));
        return mediaSalario / 4;
    }


    public float calcularBonus() {
        System.out.println("Meu bonus é "+(salarioBase * 2));
        return salarioBase * 2;
    }
    }






