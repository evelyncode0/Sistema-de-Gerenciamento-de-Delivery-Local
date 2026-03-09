
public class Main {
    public static void main(String[] args) {

        System.out.println("\n---SISTEMA DE DELIVERY - PEDIDOS---\n");
        //criando sistema
        SistemaDelivery sistema = new SistemaDelivery();

        //restauranntes
        Restaurante r1 = new Restaurante("Pizza top" , "Rua das aguas" , "Pizza");
        Restaurante r2 = new Restaurante("Emporio da carne" , "Rua esquina", "Churrasco");

        //clientes para o sistema de pedidos
        Cliente c1 = new Cliente("Evelyn", "evelyn@gmail", "35999887700");
        Cliente c2 = new Cliente("Juliana", "juliana@gmail", "35999887700");
        
        //pedidos
        sistema.adicionarPedido(c2, r2, 50);
        sistema.adicionarPedido(c1, r1, 90);

        //listando os pedidos
        System.out.println("\n---PEDIDOS CADASTRADOS NO SISTEMA---\n");
        sistema.listarPedidos();

        System.out.println("\n ---DEMONSTRAÇÃO DE POLIMORFISMO--- \n");

        //variaveis do tipo usuario recebendo objetos diferentes
        Usuario u1 = new Cliente("Ana", "ana@gmail", "7700009988 ");
        Usuario u2 = new Cliente("Bruno", "bruno@gmail", "3244556677 \n");
        Usuario u3 = new Entregador("Carlos", "carlos@gmail", "3566667777 \n");
        Usuario u4 = new Entregador("Vitor", "vitor@gmail", "3566667777 \n");

        //chamando dados - polimorfia
        u1.exibirDados();
        System.out.println();
        u2.exibirDados();
        System.out.println();
        u3.exibirDados();
        System.out.println();
        u4.exibirDados();
       
    }
    
}
