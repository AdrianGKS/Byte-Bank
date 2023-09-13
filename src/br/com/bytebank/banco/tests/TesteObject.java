package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

//        System.out.println("A");
//        System.out.println(1);
//        System.out.println(false);

        Object contaCorrente = new ContaCorrente(111,111);
        Object contaPoupanca = new ContaPoupanca(222,222);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

//        Cliente c = new Cliente();
//        //println(c);
//
//        Object cliente = new Cliente();
//        //println(cliente);


    }

//    static void println() {}
//    static void println(int a) {}
//    static void println(boolean b) {}
//    static void println(Object ref) {}

}
