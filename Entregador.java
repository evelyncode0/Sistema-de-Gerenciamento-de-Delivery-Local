public class Entregador extends Usuario { //criando a subclasse (entregador) da classe pai (usuario) - herança

    public Entregador(String nome, String email, String telefone){
        super(nome, email, telefone); //inicializa os atributos da classe pai
    }

    //metodos para entregador
    @Override //evita bugs quando sobreescrever um metodo
    public void exibirDados(){
        System.out.println("---DADOS DO ENTREGADOR---");
        System.out.println("Entregador: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }
}
