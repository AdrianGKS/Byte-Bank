package br.com.bytebank.banco.util;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {

        List<Conta> list = new ArrayList<>();

        Conta cc = new ContaCorrente(111, 111);
        list.add(cc);

        Conta cc2 = new ContaCorrente(222, 222);
        list.add(cc2);

        System.out.println(list.size());

        Conta ref = list.get(0);
        System.out.println(ref);

        list.remove(0);
        System.out.println(list.size());

        Conta cc3 = new ContaCorrente(333, 333);
        list.add(cc3);

        Conta cc4 = new ContaCorrente(444, 444);
        list.add(cc4);

        for(Conta c : list) {
            System.out.println(c);
        }
    }
}
