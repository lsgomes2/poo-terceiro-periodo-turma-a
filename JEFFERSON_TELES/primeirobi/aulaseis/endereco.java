package primeirobi.aulaseis;

public class endereco {
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public endereco(String estado, String cidade, String bairro, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarSe() {
        System.out.println("Endereço: " + numero + ", " + complemento + ", " + bairro + ", " + cidade + " - " + estado);
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return numero + ", " + complemento;
    }
}
