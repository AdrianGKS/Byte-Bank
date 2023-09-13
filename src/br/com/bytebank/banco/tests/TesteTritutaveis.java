package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.*;

public class TesteTritutaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 124);
        cc.deposita(100.0);

        Seguro seguro = new Seguro();

        CalculadorDeImposto ci = new CalculadorDeImposto();
        ci.registrador(cc);
        ci.registrador(seguro);

        System.out.println(ci.getTotalImposto());
    }
}
