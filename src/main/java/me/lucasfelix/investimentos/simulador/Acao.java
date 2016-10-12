package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.modelo.Investimento;
import me.lucasfelix.investimentos.modelo.Titulo;

public interface Acao {
    public void executa(Titulo titulo);
}
