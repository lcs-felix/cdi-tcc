package me.lucasfelix.investimentos.producer;

import me.lucasfelix.investimentos.logger.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

    @Produces
    public Logger fabricaLogger(InjectionPoint ip) {
        Class<?> clazz = ip.getMember().getDeclaringClass();
        return new Logger(clazz);
    }
}
