package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

import java.util.Date;

public class ProcessaPedido extends Pedido {

    @SuppressWarnings({ "deprecation" })
    public ProcessaPedido(String name, String id, float price,
            Cliente customer, Vendedor seller, Loja store, Date creation,
            int paymentDay, int paymentMonth) {

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 0.0f) {
                prices[i] = price;
            }
        }
        this.id = id;
        this.customer = customer;
        this.seller = seller;
        this.store = store;
        this.creation = creation;
        this.paymentDay = paymentDay;
        this.paymentMonth = paymentMonth;
        this.paymentDate = new Date(124, paymentMonth - 1, paymentDay);
        this.limitDate = new Date(this.creation.getTime() + (5 * 86400000));

    }

    private boolean confirm() {

        Date now = new Date();

        if (now.getTime() > limitDate.getTime()) {
            return false;
        }

        return true;
    }
}
