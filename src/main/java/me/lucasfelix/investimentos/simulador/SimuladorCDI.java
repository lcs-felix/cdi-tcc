package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.modelo.Titulo;

@CDI
public class SimuladorCDI implements Simulador {

    @Override
    public Double retornoDoInvestimento(Titulo titulo) {
        return titulo.getValor() * 1.15;
    }
}
