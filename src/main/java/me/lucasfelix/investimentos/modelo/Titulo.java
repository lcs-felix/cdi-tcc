package me.lucasfelix.investimentos.modelo;

public class Titulo {
    private Double valor;

    public Titulo(Double valor) {
        this.valor = valor;
    }

    public Titulo() {

    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
