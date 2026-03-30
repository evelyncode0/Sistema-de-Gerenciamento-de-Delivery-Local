package br.edu.unilavras.services;

public class EntregaMoto implements Entregavel {

    @Override
    public String realizarEntrega() {
        return "Entrega rápida e motorizada.";
    }

}
