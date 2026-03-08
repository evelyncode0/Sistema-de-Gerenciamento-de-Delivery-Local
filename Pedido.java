public class Pedido {
    //referencias para outros objetos (associação entre objetos)
    Cliente cliente;
    Restaurante restaurante;
    double valorTotal;

    //metodo para mostrar pedido
    void exibirPedido(){
        System.out.println("------PEDIDO------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("Restaurante: " + restaurante.nome);
        System.out.println("Valor Total R$: " + valorTotal);
        System.out.println("------FIM  DO PEDIDO------");
        System.out.println("");
    }
}
