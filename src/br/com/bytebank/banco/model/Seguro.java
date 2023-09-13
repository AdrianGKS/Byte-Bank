package br.com.bytebank.banco.model;

public class Seguro implements Tributacao {
    @Override
    public double getValorImposto() {
        return 53;
    }
}
