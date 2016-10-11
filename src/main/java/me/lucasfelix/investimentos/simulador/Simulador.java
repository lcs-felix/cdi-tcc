package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.modelo.Titulo;

public interface Simulador {

    Double retornoDoInvestimento(Titulo titulo);
}
