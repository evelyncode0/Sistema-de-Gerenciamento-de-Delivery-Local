package br.edu.unilavras.model;

public class Cliente extends Usuario { // criando subclass da classe pai (usuario) - herança

    // construtor com atributos da classe pai
    public Cliente(String nome, String email, String telefone) {
        super(nome, email, telefone); // inicializa os atributos da classe pai
    }

    // metodos para dados do cliente
    @Override // evita bugs para sobrescrever os metodos
    public void exibirDados() {
        System.out.println("---DADOS DO CLIENTE---");
        System.out.println("Cliente: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());

    }
}
