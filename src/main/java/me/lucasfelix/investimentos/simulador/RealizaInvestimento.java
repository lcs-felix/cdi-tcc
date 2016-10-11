package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.inject.Inject;

public class RealizaInvestimento {

    @Inject
    private Logger logger;

    @Inject
    private DescontaDaContaCorretora corretora;

    @Inject
    private EnviadorDeEmail email;

    public void realizaInvestimento(Titulo titulo) {
        logger.info("Realizando investimento");

        corretora.desconta(titulo);
        email.envia(titulo);
    }
}
