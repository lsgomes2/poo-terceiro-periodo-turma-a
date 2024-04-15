package primeirobi.aulaseis;

import java.util.Date;
import java.util.List;

import primeirobi.Cliente;
import primeirobi.Loja;
import primeirobi.Vendedor;

public class pedido {
    private int id;
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private List<item> itens;

    public pedido(int id, Date dataCriacao, Cliente cliente, Vendedor vendedor, Loja loja, List<item> itens) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        calcularDataVencimentoReserva();
    }

    Date calcularDataVencimentoReserva() {
        long tresDias = 3 * 24 * 60 * 60 * 1000;
        return this.dataVencimentoReserva = new Date(this.dataCriacao.getTime() + tresDias);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public void gerarDescricaoVenda() {
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
    }

    public void apresentarSe() {
        System.out.println("ID do Pedido: " + id);
        System.out.println("Data de Criação: " + dataCriacao);
        System.out.println("Data de Pagamento: " + dataPagamento);
        System.out.println("Data de Vencimento da Reserva: " + dataVencimentoReserva);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Loja: " + loja.getNome());
        System.out.println("Itens do Pedido:");
        for (item item : itens) {
            item.gerarDescricao();
        }
        System.out.println("Valor Total do Pedido: " + calcularValorTotal());
    }

    public void setDataPagamento(Date dataAtual) {
        this.dataPagamento = dataAtual;
    }
}
