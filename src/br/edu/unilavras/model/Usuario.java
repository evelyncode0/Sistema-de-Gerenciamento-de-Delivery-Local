package br.edu.unilavras.model;

public abstract class Usuario {
    // atributos
    private String nome;
    private String email;
    private String telefone;

    // construtor com validações (regra de negocio)
    public Usuario(String nome, String email, String telefone) {

        if (nome == null || nome.trim().isEmpty()) { // verifica se o nome é nulo ou com espaçõs e vazio
            System.out.println("Nome de usuário inválido.");
            this.nome = "Usuário sem nome";
        } else {
            this.nome = nome;
        }

        if (email == null || email.trim().isEmpty()) {
            System.out.println("Email do usuário inválido.");
            this.email = "Usuário sem email";
        } else {
            this.email = email;
        }

        if (telefone == null || telefone.trim().isEmpty()) {
            System.out.println("Telefone do usuário inválido.");
            this.telefone = "Usuário sem telefone";
        } else {
            this.telefone = telefone;
        }
    }

    // getters para acessar atributos privados

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    // setter opcional (estava em cliente e passei para usuario na parte 4 do
    // trabalho)
    public void setTelefone(String telefone) { // reforçando validação de telefone para não quebrar a regra de negocio e
                                               // criar um telefone invalido após alteração no setter.
        if (telefone == null || telefone.trim().isEmpty()) {
            System.out.println("Telefone inválido");
        } else {
            this.telefone = telefone;
        }

    }

    // metodo public para ser chamado no main sem problemas de pacote
    public void exibirDados() {
        System.out.println("---DADOS DO USUÁRIO---");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }
}
