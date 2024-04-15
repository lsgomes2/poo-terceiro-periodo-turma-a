package primeirobi.atividades.lista6;

import java.util.Date;

public class ProcessaPedido {
    public static void processar(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, Item[] itens) {
        Pedido pedido = new Pedido(id, dataCriacao, cliente, vendedor, loja, itens);
        if (confirmarPagamento(pedido)) {
            System.out.println("Pedido processado com sucesso!");
            pedido.gerarDescricaoVenda();
        } else {
            System.out.println("Falha ao processar o pedido. Pagamento não confirmado.");
        }
    }

    private static boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        if (dataAtual.before(pedido.dataVencimentoReserva)) {
            pedido.dataPagamento = dataAtual;
            return true;
        }
        return false;
    }
}