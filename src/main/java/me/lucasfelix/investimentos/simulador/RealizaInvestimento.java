package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class RealizaInvestimento {

    @Inject
    private Logger logger;

    @Inject
    private Event<Titulo> evento;

    public void realizaInvestimento(Titulo titulo) {
        System.out.println("Realizando investimento");

        evento.fire(titulo);
    }
}
