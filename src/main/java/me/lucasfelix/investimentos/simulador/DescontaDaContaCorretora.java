package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.inject.Inject;

public class DescontaDaContaCorretora {

    @Inject
    private Logger logger;

    public void desconta(Titulo titulo) {
        logger.info("Descontando da conta da corretora o valor: " + titulo.getValor());
    }
}
