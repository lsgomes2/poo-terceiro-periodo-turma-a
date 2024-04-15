package primeirobi.aulaseis;

public class endereco {
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public endereco(String estado, String cidade, String bairro, String string, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = string;
        this.complemento = complemento;
    }

    public void apresentarSe() {
        System.out.println("Endereço: " + numero + ", " + complemento + ", " + bairro + ", " + cidade + " - " + estado);
    }
}
