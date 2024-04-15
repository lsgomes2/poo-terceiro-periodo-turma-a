package exseis;

public class ProcessaPedido {

    public void processar(Pedido pedido) {
        // Aqui você pode adicionar lógica para processar o pedido
        confirmarPagamento(pedido);
    }

    private void confirmarPagamento(Pedido pedido) {
        Date agora = new Date
