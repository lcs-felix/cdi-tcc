package me.lucasfelix.investimentos.servlet;

import me.lucasfelix.investimentos.logger.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/compra")
public class CompraTituloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Logger logger = new Logger(CompraTituloServlet.class);
        logger.info("Iniciando a compra de título");
    }
}
