package br.com.bytebank.banco.util;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.sort(new Comparator<Conta>() { //classe anônima
                @Override
                public int compare(Conta o1, Conta o2) {
                    return Integer.compare(o1.getNumero(), o2.getNumero());
                }
            }
        );

        for (Conta conta: lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }

        Comparator<Conta> comparator = new Comparator<Conta> (){
            @Override
            public int compare(Conta o1, Conta o2) {
                String titular1 = o1.getTitular().getNome();
                String titular2 =  o2.getTitular().getNome();
                return titular1.compareTo(titular2);
            }
        };

        for (Conta conta: lista) {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        }
    }
}
