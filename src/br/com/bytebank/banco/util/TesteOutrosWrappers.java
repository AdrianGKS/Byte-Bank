package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(5.6); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE;//autoboxing
        System.out.println(bRef.booleanValue());//unboxing

        Number num = Float.valueOf(35.4f);

        List<Number> list = new ArrayList<>();
        list.add(11);
        list.add(15.4);
        list.add(24.1f);
    }
}
