package br.com.bytebank.banco.model;

public class CalculadorDeImposto {

    private double total;

    public void registrador(Tributacao t) {
        double valor = t.getValorImposto();
        this.total += valor;
    }

    public double getTotalImposto() {
        return total;
    }
}
