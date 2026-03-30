package br.edu.unilavras.services;

import br.edu.unilavras.model.Cliente;
import br.edu.unilavras.model.Pedido;
import br.edu.unilavras.model.Restaurante;
import java.util.ArrayList;

public class SistemaDelivery {

    // lista para guardar os pedidos
    private ArrayList<Pedido> listaPedidos; // lista dinamica

    // construtor
    public SistemaDelivery() {
        listaPedidos = new ArrayList<>();
    }

    // metodo criando o pedido
    public void adicionarPedido(Cliente cliente, Restaurante restaurante, double valor, Entregavel tipoEntrega) {

        // criadndo pedido usando o construtor correto
        Pedido novoPedido = new Pedido(cliente, restaurante, valor, tipoEntrega);

        listaPedidos.add(novoPedido); // guarda o pedido na lista
    }

    // metodo para listar pedidos e mostrar tudo
    public void listarPedidos() {
        if (listaPedidos.isEmpty()) { // verificando se há pedidos vazios
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }

        // para cada pedido dentro da lista
        for (Pedido p : listaPedidos) { // foreach
            // mostre os dados desse pedido
            p.exibirPedido();
        }
    }

}
