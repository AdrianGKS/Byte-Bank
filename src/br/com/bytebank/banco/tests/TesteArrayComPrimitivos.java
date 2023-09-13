package br.com.bytebank.banco.tests;

public class TesteArrayComPrimitivos {
    public static void main(String[] args) {

        int[] idade = new int[5];

        System.out.println("Valor pos 0 do Array: " + idade[0]);

        System.out.println("Tamanho do Array: " + idade.length);

        for(int i = 0; i < idade.length; i++) {
            idade[i] = i * i;
        }

        for(int i = 0; i < idade.length; i++) {
            System.out.print(idade[i] + " ");
        }

    }
}
