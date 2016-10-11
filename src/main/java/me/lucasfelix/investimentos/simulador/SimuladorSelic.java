package me.lucasfelix.investimentos.simulador;

public class SimuladorSelic {

    public Double retornoDoInvestimento(Titulo titulo) {
        // Rende 14% ao ano
        return titulo.getValor() * 1.14;
    }
}
