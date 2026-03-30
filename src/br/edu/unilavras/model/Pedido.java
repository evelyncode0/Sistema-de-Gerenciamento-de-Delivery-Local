package br.edu.unilavras.model;

import br.edu.unilavras.services.Entregavel;

public class Pedido {
    // referencias para outros objetos (associação entre objetos)
    private Cliente cliente;
    private Restaurante restaurante;
    private double valorTotal;
    private int id;
    static int contador;
    private Entregavel tipoEntrega;

    // construtor
    public Pedido(Cliente cliente, Restaurante restaurante, double valorTotal, Entregavel tipoEntrega) {
        if (cliente == null) {
            System.out.println("Pedido do cliente inválido.");
        } else {
            this.cliente = cliente;
        }

        if (restaurante == null) {
            System.out.println("Pedido e restaurante inválidos.");
        } else {
            this.restaurante = restaurante;
        }

        if (valorTotal < 0) {
            System.out.println("Valor negativo não é permitido.");
            this.valorTotal = 0;
        } else {
            this.valorTotal = valorTotal;
        }

        if (tipoEntrega == null) {
            System.out.println("Tipo de entrega não reconhecido");
        } else {
            this.tipoEntrega = tipoEntrega;
        }

        // gerar ID automatico
        contador++;
        this.id = contador;
    }

    // getters

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    // metodo para mostrar o tipo de entrega
    public void realizarEntrega() {
        tipoEntrega.realizarEntrega(); // polimorsfismo com interface
    }

    // metodo para mostrar pedido
    public void exibirPedido() {
        System.out.println("------PEDIDO------");
        System.out.println("ID do pedido: " + getId());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Valor Total R$: " + valorTotal);
        System.out.println("Tipo de entrega: " + tipoEntrega.realizarEntrega());
        System.out.println("------FIM  DO PEDIDO------");
        System.out.println("");
    }
}
