public class Main {
    public static void main(String[] args) {
        //primeiro restaurannte
        Restaurante r1 = new Restaurante();
        r1.nome = "Frango frito mineiro";
        r1.endereco = "Centro, 154";
        r1.categoria = "Frango";

        //segundo restaurante
        Restaurante r2 = new Restaurante();
        r2.nome = "Casa da goiaba";
        r2.endereco = "Centro, 999";
        r2.categoria = "Sorvete e pizza";

        // //exibindo os dados
        // r1.exibirDados();
        // r2.exibirDados();

        //criando primeiro cliente
        Cliente c1 = new Cliente();
        c1.nome = "Maria";
        c1.telefone = "9898-0055";

        Cliente c2 = new Cliente();
        c2.nome = "Jonas";
        c2.telefone = "5500-6677";

        //criando sistema
        SistemaDelivery sistema = new SistemaDelivery();

        //criando pedido
        sistema.criarPedido(c1, r1, 50.0);
        sistema.criarPedido(c2, r2, 80.0);

        //listando os pedidos
        sistema.listarPedidos();
    }
    
}
