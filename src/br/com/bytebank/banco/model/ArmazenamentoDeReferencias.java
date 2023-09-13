package br.com.bytebank.banco.model;

public class ArmazenamentoDeReferencias {

    private Object[] referencias;
    private int aux;

    public ArmazenamentoDeReferencias() {
        this.referencias =  new Object[10];
    }

    public void adiconar(Conta conta) {
        this.referencias[this.aux] = conta;
        this.aux++;
    }

    public int getQuantElementos() {
        return this.aux;
    }

    public Object getReferencia(int i) {
        return this.referencias[i];
    }
}
