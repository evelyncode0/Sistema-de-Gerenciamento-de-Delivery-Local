public class Pedido {
    //referencias para outros objetos (associação entre objetos)
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;
    private int id;
    static int contador;

    //construtor
    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal){
        if (cliente == null){
            System.out.println("Pedido do cliente inválido.");
        } else{
            this.cliente = cliente;
        }

        if (restaurante == null){
            System.out.println("Pedido e restaurante inválidos.");
        } else{
            this.restaurante = restaurante;
        }

        if (valorTotal < 0){
            System.out.println("Valor negativo não é permitido.");
            this.valorTotal = 0;
        } else{
            this.valorTotal = valorTotal;
        }

        //gerar ID automatico
        contador++;
        this.id = contador;
    }

    //getters

    public int getId(){
        return id;
    }

    public double getValorTotal(){
        return valorTotal;
    }

    //metodo para mostrar pedido
    void exibirPedido(){
        System.out.println("------PEDIDO------");
        System.out.println("ID do pedido: " + getId());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Valor Total R$: " + valorTotal);
        System.out.println("------FIM  DO PEDIDO------");
        System.out.println("");
    }
}
