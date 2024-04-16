package primeirobi.Exercicio6;
import java.util.Date;

public class ProcessarPedido {

    public void processar(Integer id,Item[] items){
        id=id;
        items=items;
        System.out.println(id);
        System.out.println(items);
    }

    boolean confirmarPagamento(Date dataCriacao,Date dataVencimentoReserva){
        if(dataCriacao.getTime()<dataVencimentoReserva.getTime()){
            return true;  
        }else{
            return false;
        }
    }

}
/*Método processar, que recebe os dados necessários para criação do pedido.
- Método privado confirmarPagamento(confirma caso a reserva não esteja vencida, verificar se data atual não é superior a dataVencimentoReserva).
- Criar teste para verificar método. */
