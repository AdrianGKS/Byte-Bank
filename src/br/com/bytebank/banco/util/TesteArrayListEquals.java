package br.com.bytebank.banco.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

//        Conta cc = new ContaCorrente(111, 111);
//        Conta cc2 = new ContaCorrente(111, 111);
//
//        boolean teste = cc.equals(cc2);
//        System.out.println(teste);

        ArrayList<Conta> list = new ArrayList<>();

        Conta cc = new ContaCorrente(111, 111);
        list.add(cc);

        Conta cc2 = new ContaCorrente(222, 222);
        list.add(cc2);

        Conta cc3 = new ContaCorrente(222, 222);

        boolean contains = list.contains(cc3);
        System.out.println(contains);

        for(Conta c : list) {
            System.out.println(c);
        }
    }
}
