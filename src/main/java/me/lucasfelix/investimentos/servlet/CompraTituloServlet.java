package me.lucasfelix.investimentos.servlet;

import me.lucasfelix.investimentos.annotation.Simulador;
import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Investimento;
import me.lucasfelix.investimentos.modelo.Titulo;
import me.lucasfelix.investimentos.simulador.DescontaDaContaCorretora;
import me.lucasfelix.investimentos.simulador.EnviadorDeEmail;
import me.lucasfelix.investimentos.simulador.RealizaInvestimento;
import me.lucasfelix.investimentos.simulador.SimuladorDeInvestimento;

import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/compra")
public class CompraTituloServlet extends HttpServlet {

    @Inject
    private Logger logger;

    @Inject @Simulador(investimento = Investimento.CDI)
    private SimuladorDeInvestimento simuladorDeInvestimento;

    @Inject
    private RealizaInvestimento investimento;

    @Inject
    private DescontaDaContaCorretora corretora;

    @Inject
    private EnviadorDeEmail email;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Iniciando a compra de título");

        Titulo titulo = new Titulo(1_000.0);
        Double retornoDoInvestimento = simuladorDeInvestimento.retornoDoInvestimento(titulo);

        investimento.adicionaAcao(corretora);
        investimento.adicionaAcao(email);
        investimento.realizaInvestimento(titulo);

        resp.getWriter().println("Valor + retorno: " + retornoDoInvestimento);
    }
}
