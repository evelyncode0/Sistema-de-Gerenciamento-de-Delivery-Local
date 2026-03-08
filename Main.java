public class Main {
    public static void main(String[] args) {
        //criando sistema
        SistemaDelivery sistema = new SistemaDelivery();


        //primeiro restaurannte
        Restaurante r1 = new Restaurante("Pizza top" , "Rua das aguas" , "Pizza");
       
        //segundo restaurante
        Restaurante r2 = new Restaurante("Emporio da carne" , "Rua esquina", "Churrasco");

        //teste de validação
        Restaurante r3 = new Restaurante(null, null, null);

       

        // //exibindo os dados
        // r1.exibirDados();
        // r2.exibirDados();

        //criando primeiro cliente
        Cliente c1 = new Cliente("Evelyn" , "3599990000");
       
        Cliente c2 = new Cliente("Maria" , "3500003555");

        //teste de validação
        Cliente c3 = new Cliente(null, null);
        
        sistema.adicionarPedido(c2, r2, 50);
        sistema.adicionarPedido(c1, r1, 90);

        sistema.adicionarPedido(c3, r3, -120);
       
       
        //listando os pedidos
        sistema.listarPedidos();
    }
    
}
