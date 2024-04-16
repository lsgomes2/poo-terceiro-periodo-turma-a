package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Endereco {
    String state, city, block, number, complement, street;

    void showAddress() {
        System.out.println(street + ", " + number + ", bairro "
                + block + ", " + complement + ", " + city + ", "
                + state);
    }
}
