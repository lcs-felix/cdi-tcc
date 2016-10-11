package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.annotation.Simulador;
import me.lucasfelix.investimentos.modelo.Investimento;
import me.lucasfelix.investimentos.modelo.Titulo;

@Simulador(investimento = Investimento.CDI)
public class SimuladorDeInvestimentoCDI implements SimuladorDeInvestimento {

    @Override
    public Double retornoDoInvestimento(Titulo titulo) {
        // Rende 14% ao ano
        return titulo.getValor() * 1.15;
    }
}
