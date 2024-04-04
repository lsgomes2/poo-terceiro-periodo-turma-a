package PRIMEIRO_BIMESTRE.lists.Lista5;

public class Loja {
    String popularName;
    String socialReason;
    String cnpj;
    String city;
    String block;
    String street;
    String[] sellers = new String[100];
    String[] customers = new String[1000];

    public void countCustomers(){
        int x = 0;
        int qttCustomers = 0;
        while(x < customers.length){
            if (customers[x] == null) {
                break;
            }
            qttCustomers++;
        x++;
        }
        System.out.println("A loja tem " + qttCustomers + " clientes");
    }

    public void countSellers(){
        int x = 0;
        int qttSellers = 0;
        while(x < sellers.length){
            if (sellers[x] == null) {
                break;
            }
            qttSellers++;
        }
        System.out.println("A loja tem " + qttSellers + " vendedores");
    }

    public void presentation(){
        System.out.println("Nome fantasia: ".concat(popularName));
        System.out.println("CNPJ: ".concat(cnpj));
        System.out.println("Rua ".concat(street).concat(", bairro: ")
        .concat(block).concat(", ".concat(city)));
    }
}
