package primeirobi.Exercicio6;
import java.util.Date;

public class Pedido {
    Integer id;
    Date dataCriacao = new Date();
    Date dataPagamento;
    Date dataVencimentoReserva = new Date(dataCriacao.getTime()+(86400000*3));
    Cliente cliente;
    Vendedor vendedor;
    Loja loja;
    Item [] items = new Item[20];

    public Double calcularValorTotal(){
        double total=0;
        for(int i=0;i<items.length;i++){
            if(items[i]!=null){
                total=total+items[i].valor;
            }
        }
        return total;
    }

    public void gerarDescricaoVenda(){
        System.out.println("Data de criação: "+dataCriacao);
        System.out.println("Data de vencimento: "+dataVencimentoReserva);
        System.out.println("Valor total:"+calcularValorTotal());
    }

}
