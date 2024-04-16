package primeirobi.atividades.lista6;

import java.util.Date;

public class Pedido {

    private int id;
    private int dataCriacao;
    private int dataPagamento;
    private int dataVencimentoReserva;
    private String cliente; 
    private String vendedor;
    private String loja; 
    private String [] itens;

    public Pedido(int id, int dataCriacao, int dataPagamento, int dataVencimentoReserva, String cliente, String vendedor, String loja, String [] itens){

    this.id = id;
    this.dataCriacao = dataCriacao;
    this.dataPagamento = dataPagamento;
    this.dataVencimentoReserva = dataVencimentoReserva;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.loja = loja;
    this.itens = itens;

    }

}
