package me.lucasfelix.investimentos.logger;

public class Logger {

    private Class<?> clazz;

    public Logger(Class<?> clazz) {
        this.clazz = clazz;
    }

    public void info(String mensagem) {
        System.out.println(clazz + ": " + mensagem);
    }
}
