package MyyPlantaula6;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private Date dataVencimentoReserva; // Adicionado atributo para data de vencimento da reserva
    private Item[] itens;
    
    // Construtor para o Pedido
    public Pedido(int id, Date dataCriacao, Cliente cliente, Gerente vendedor, Loja loja, Item[] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.itens = itens;

        // Calcular a data de vencimento da reserva (3 dias após a criação do pedido)
        long tresDiasEmMillis = 3 * 24 * 60 * 60 * 1000;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + tresDiasEmMillis);
    }

    public Pedido(int idPedido, Date dataCriacao2, Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens2) {
  
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    // Método para gerar uma descrição da venda
    public String gerarDescricaoVenda() {
        return "Pedido ID: " + id + ", Data de Criação: " + dataCriacao + ", Valor Total: " + calcularValorTotal();
    }

    // Método para obter a data de vencimento da reserva
    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }
}
