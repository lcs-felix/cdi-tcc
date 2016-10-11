package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.modelo.Titulo;

public interface SimuladorDeInvestimento {

    Double retornoDoInvestimento(Titulo titulo);
}
