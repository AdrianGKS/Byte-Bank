package br.com.bytebank.banco.tests;

public class TesteString {

    public static void main(String[] args) {

        String nome = "Adrian";
        System.out.println("String nome: " + nome);

        String nome2 = nome.replace("A", "Z");
        System.out.println("Substituindo caracteres: " + nome2);

        String nome3 = nome.toUpperCase();
        System.out.println("Tudo em maiúsculo: " + nome3);

        System.out.println("Posição específica: " + nome.charAt(2));

        System.out.println("Onde onde começa 'an': " + nome.indexOf("an"));

        System.out.println("Substring: " + nome.substring(2));

        System.out.println("Tamanho : "  + nome.length());

        for (int i = 0; i < nome.length(); i ++) {
            System.out.print(nome.charAt(i) + " ");
        }

        String a = "";
        System.out.println("\nEstá vazio? " + a.isEmpty());
        System.out.println("Está vazio? " + nome.isEmpty());

        String b = " ";
        System.out.println("Vazio com espaço? " + b.isEmpty());

        String c = b.trim();
        System.out.println("Vazio sem espaço? trim(): " + c.isEmpty());

        System.out.println("Verificando se há 'Ad' na variável: " + nome.contains("Ad"));
    }
}
