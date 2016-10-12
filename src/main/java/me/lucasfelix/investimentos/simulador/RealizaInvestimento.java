package me.lucasfelix.investimentos.simulador;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class RealizaInvestimento {

    private List<Acao> acoes = new ArrayList<>();

    public void realizaInvestimento(Titulo titulo) {
        System.out.println("Realizando investimento");

        for(Acao acao : acoes) {
            acao.executa(titulo);
        }
    }

    public void adicionaAcao(Acao acao) {
        this.acoes.add(acao);
    }
}
