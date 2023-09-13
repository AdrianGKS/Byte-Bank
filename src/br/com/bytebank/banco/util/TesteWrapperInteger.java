package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        int idade = 20;

        Integer id = 30;
        int value = id;

        String s = args[0];
        id = Integer.valueOf(s);
        System.out.println(id);

        id = Integer.parseInt(s);
        System.out.println(id);

        id.doubleValue();
        System.out.println(id);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

//        num.add(id);
//        System.out.println(num);
    }
}
