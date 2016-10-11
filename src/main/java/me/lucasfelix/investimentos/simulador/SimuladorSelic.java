package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.modelo.Titulo;

public class SimuladorSelic implements Simulador {

    @Override
    public Double retornoDoInvestimento(Titulo titulo) {
        // Rende 14% ao ano
        return titulo.getValor() * 1.14;
    }
}
