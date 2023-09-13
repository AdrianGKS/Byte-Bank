package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.*;


public class TesteSaque {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123, 111);

        conta.deposita(200);
        try {
            conta.saca(210);
        } catch (ExceptionSaldo e) {
            System.out.println("Exception: " + e.getMessage());
        }


        System.out.println(conta.getSaldo());
    }
}
