package br.edu.unilavras.model;

public class Restaurante {

    // atributos encapsulados
    private String nome;
    private String endereco;
    private String categoria;

    // construtor
    public Restaurante(String nome, String endereco, String categoria) {
        if (nome == null || nome.trim().isEmpty()) { // validação do nome, verifica se é nulo ou com string vazia e com
                                                     // espaços
            System.out.println("Nome vazio ou inválido.");
            this.nome = "Restaurante sem nome"; // definição do sistema se o nome for nulo ou invalido
        } else {
            this.nome = nome;
        }

        this.endereco = endereco;
        this.categoria = categoria;
    }

    // getters

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    // setters opcionais

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // metodo que exibe os dados
    public void exibirDados() {
        System.out.println("----------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Categoria: " + categoria);
        System.out.println("----------------------");
    }

}
