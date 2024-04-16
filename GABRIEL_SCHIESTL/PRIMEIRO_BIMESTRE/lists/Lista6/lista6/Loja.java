package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Loja extends Endereco {
    String popularName;
    String socialReason;
    String cnpj;
    String[] sellers = new String[100];
    String[] customers = new String[1000];

    public Loja(String popularName, String socialReason, String cnpj) {
        this.popularName = popularName;
        this.socialReason = socialReason;
        this.cnpj = cnpj;
    }

    public void countCustomers() {
        int x = 0;
        int qttCustomers = 0;
        while (x < customers.length) {
            if (customers[x] == null) {
                break;
            }
            qttCustomers++;
            x++;
        }
        System.out.println("A loja tem " + qttCustomers + " clientes");
    }

    public void countSellers() {
        int x = 0;
        int qttSellers = 0;
        while (x < sellers.length) {
            if (sellers[x] == null) {
                break;
            }
            qttSellers++;
        }
        System.out.println("A loja tem " + qttSellers + " vendedores");
    }

    public void presentation() {
        System.out.println("Nome fantasia: ".concat(popularName));
        System.out.println("CNPJ: ".concat(cnpj));
        System.out.println("Rua ".concat(street).concat(", bairro: ")
                .concat(block).concat(", ".concat(city)));
    }
}
