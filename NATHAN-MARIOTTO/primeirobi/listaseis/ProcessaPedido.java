package primeirobi.listaseis;

public class ProcessaPedido {
    public void processar(Pedido pedido) {
        System.out.println("Processando pedido...");
        pedido.gerarDescricaoVenda();
    }

    private boolean confirmarPagamento(Pedido pedido) {
        
        Date now = new Date();
        return now.before(pedido.dataVencimentoReserva);
    }
}
