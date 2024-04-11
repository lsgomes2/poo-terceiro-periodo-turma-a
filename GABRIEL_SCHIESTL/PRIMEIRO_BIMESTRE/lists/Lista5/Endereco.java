package PRIMEIRO_BIMESTRE.lists.Lista5;

public class Endereco {
    String state, city, block, number, complement, street;

    void showAddress() {
        System.out.println(street + ", " + number + ", bairro "
                + block + ", " + complement + ", " + city + ", "
                + state);
    }
}
