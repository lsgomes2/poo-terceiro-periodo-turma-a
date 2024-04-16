package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

import java.util.Date;

public class Pedido {

    String id, name;
    float[] prices = new float[100];
    Cliente customer;
    Vendedor seller;
    Loja store;
    String[] items = new String[100];
    Date creation;
    int paymentDay;
    int paymentMonth;
    Date paymentDate;
    Date limitDate;
    float totalPrice = calculateTotalPrice();

    float calculateTotalPrice() {

        float total = 0;
        for (int i = 0; i < items.length; i++) {
            if (prices[i] != 0.0f) {
                total += prices[i];
            } else {
                return 0.0f;
            }
        }
        return total;
    }

    void showDescription() {
        System.out.println(creation + ", Preco final: " + totalPrice);
    }
}
