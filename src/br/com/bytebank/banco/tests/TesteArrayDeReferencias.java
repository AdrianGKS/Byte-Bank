package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteArrayDeReferencias {
    public static void main(String[] args) {

        Object[] refs = new Object[4];

        ContaCorrente c1 = new ContaCorrente(111,111);
        refs[0] = c1;

        ContaPoupanca c2 = new ContaPoupanca(222,222);
        refs[1] = c2;

        Cliente cliente = new Cliente();
        refs[2] = cliente;


        ContaPoupanca ref = (ContaPoupanca) refs[1]; //casting
        System.out.println(c2.getNumero());
        System.out.println(ref.getNumero());

    }
}
