package MyyPlantaula6;

import java.util.Date;
import java.util.List;

@SuppressWarnings("unused")
public class ProcessaPedido {
    // Método para processar o pedido
    public Pedido processar(int idPedido, Date dataCriacao, Cliente cliente, Gerente vendedor, Loja loja, Item[] itens) {
        Pedido pedido = new Pedido(idPedido, dataCriacao, cliente, vendedor, loja, itens);
        if (!confirmarPagamento(pedido)) {
            System.out.println("Erro ao processar pedido: reserva vencida.");
            return null; // Retornar null em caso de erro
        }

        System.out.println("Pedido processado com sucesso!");
        return pedido; // Retornar o pedido criado
    }

    // Método privado para confirmar o pagamento
    private boolean confirmarPagamento(Pedido pedido) {
        Date dataAtual = new Date();
        return dataAtual.before(pedido.getDataVencimentoReserva());
    }
}
