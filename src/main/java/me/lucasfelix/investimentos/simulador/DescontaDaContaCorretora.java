package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.inject.Inject;

public class DescontaDaContaCorretora implements Acao{

    @Inject
    private Logger logger;

    @Override
    public void executa(Titulo titulo) {
        logger.info("Descontando da conta da corretora o valor: " + titulo.getValor());
    }
}
