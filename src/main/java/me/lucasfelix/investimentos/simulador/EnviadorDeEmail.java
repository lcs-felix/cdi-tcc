package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class EnviadorDeEmail implements Acao{

    @Inject
    private Logger logger;

    @Override
    public void executa(@Observes Titulo titulo) {
        logger.info("Enviando e-mail de confirmação com o valor: " + titulo.getValor());
    }
}
