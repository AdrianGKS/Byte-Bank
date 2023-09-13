package br.com.bytebank.banco.tests;

import br.com.bytebank.banco.model.ArmazenamentoDeReferencias;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteArmazDeReferencias {
    public static void main(String[] args) {

        ArmazenamentoDeReferencias contas = new ArmazenamentoDeReferencias();

        Conta contaCorrente = new ContaCorrente(111, 111);
        contas.adiconar(contaCorrente);

        Conta contaCorrente2 = new ContaCorrente(222, 222);
        contas.adiconar(contaCorrente2);

        int tam = contas.getQuantElementos();
        System.out.println("Total de contas criadas: " + tam);

        Conta ref = (Conta) contas.getReferencia(1);
        System.out.println(ref);
    }
}
