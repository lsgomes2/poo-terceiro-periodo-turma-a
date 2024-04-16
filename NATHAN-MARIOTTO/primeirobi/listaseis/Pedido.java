package primeirobi.listaseis;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date dataCriacao;
    private String parceiro;
    private Cliente cliente;
    private ArrayList<Item> itens = new ArrayList<>();
    private Date dataVencimentoReserva;

    public Pedido(int id, Cliente cliente, String parceiro) {
        this.id = id;
        this.cliente = cliente;
        this.parceiro = parceiro;
        this.dataCriacao = new Date();
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getValor).sum();
    }

    public void gerarDescricaoVenda() {
        System.out.printf("Pedido #%d criado em: %s, Parceiro: %s, Valor Total: %.2f\n", id, dataCriacao, parceiro, calcularValorTotal());
    }
}
