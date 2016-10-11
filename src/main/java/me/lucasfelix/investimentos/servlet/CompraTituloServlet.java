package me.lucasfelix.investimentos.servlet;

import me.lucasfelix.investimentos.logger.Logger;

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

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Iniciando a compra de título");
    }
}
