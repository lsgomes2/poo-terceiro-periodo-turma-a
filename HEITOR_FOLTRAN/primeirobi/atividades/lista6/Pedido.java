package primeirobi.atividades.lista6;

import java.util.Date;

public class Pedido {

    private int dataCriacao;
    int dataPagamento;
    int dataVencimentoReserva;
    private int id;
    private String cliente, vendedor, loja;
    private int [] itens;

    public Pedido(int id, int dataCriacao, String cliente, String vendedor, String loja, int [] itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        this.dataVencimentoReserva = new Date(dataCriacao.getTime() + (3 * 24 * 60 * 60 * 1000)); // 3 dias em milissegundos
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int item : itens) {
            total += item.valor;
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Pedido #" + id + " criado em: " + dataCriacao + ", Valor Total: " + calcularValorTotal());
    }
}
