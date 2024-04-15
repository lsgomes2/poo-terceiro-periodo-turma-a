package BIM1.Lista5Lojas;

import java.util.Date;

public class ProcessaPedido {
    private Pedido pedido;
    private long tresDias = 3*86400000l;
    private Date dataAtual;

    public ProcessaPedido(Pedido pedido) {
        this.pedido = pedido;
        this.dataAtual = new Date();
    }

    public void processar(){
        if(confirmarPagamento();){
            System.out.println("Pagamento confirmado");
        }
        else{
            System.out.println("Pagamento pendente");
        }
    }
    private boolean confirmarPagamento(){
        Date dataVencimento = new Date(pedido.getDataCriacao().getTime() + tresDias);
        return dataAtual.after(dataVencimento);
    }

}
