
import java.util.ArrayList;

public class SistemaDelivery {

    //lista para guardar os pedidos
    ArrayList<Pedido> listaPedidos = new ArrayList<>(); //lista dinamica

    //metodo criando o pedido
    void criarPedido(Cliente c, Restaurante r, double valor){

        Pedido novoPedido = new Pedido();

        novoPedido.cliente = c;
        novoPedido.restaurante = r;
        novoPedido.valorTotal = valor;

        listaPedidos.add(novoPedido); //guarda o pedido na lista
    }

    //metodo para listar pedidos e mostrar tudo
    void listarPedidos(){
        //para cada pedido dentro da lista
        for (Pedido p : listaPedidos){ //foreach
            //mostre os dados desse pedido
            p.exibirPedido();
        }
    }
    
}
