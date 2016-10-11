package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

@Specializes
public class SimuladorCDB extends SimuladorDeInvestimentoCDI {

    @Inject
    private Logger logger;

    @PostConstruct
    public void inicio() {
        logger.info("Iniciando o simulador CDB");
    }

    @Override
    public Double retornoDoInvestimento(Titulo titulo) {
        // Rende 15.5% ao ano
        return super.retornoDoInvestimento(titulo) * 1.05;
    }
}
