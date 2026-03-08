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

        //exibindo os dados
        r1.exibirDados();
        r2.exibirDados();
    }
    
}
