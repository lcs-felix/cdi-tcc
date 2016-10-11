package me.lucasfelix.investimentos.servlet;

import me.lucasfelix.investimentos.logger.Logger;
import me.lucasfelix.investimentos.modelo.Titulo;
import me.lucasfelix.investimentos.simulador.CDI;
import me.lucasfelix.investimentos.simulador.Selic;
import me.lucasfelix.investimentos.simulador.Simulador;

import javax.inject.Inject;
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

    @Inject @Selic
    private Simulador simulador;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Iniciando a compra de título");

        Titulo titulo = new Titulo(1_000.0);
        Double retornoDoInvestimento = simulador.retornoDoInvestimento(titulo);

        resp.getWriter().println("Valor + retorno: " + retornoDoInvestimento);
    }
}
