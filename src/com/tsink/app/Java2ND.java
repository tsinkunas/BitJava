package com.tsink.app;

import javax.print.DocFlavor;

public class Java2ND {
    public static void main(String[] args){
        // Primityvūs duomenų tipai
        // 1. Kintamojo int max ir min reikšmės:

        System.out.println("int Max (" + Integer.MAX_VALUE + ")");
        System.out.println("int Min (" + Integer.MIN_VALUE + ")");

        // 1a - Ar galėtume sutalpinti visų žemėje gyvenančių žmonių skaičių į int?
        // ne, nes populiacijos skaičius yra didesnis už int max: ~ 7810164850, tačiau galima su kintamuoju 'long'
        long populiation = 7810164850l;
        System.out.println(populiation);
        // 1b - Ar galėtume saugoti lietuvišką asmens kodą int tipo kintamąjame? Jei ne, kokį reiktų pasirinkti?
        // ne, nes asmens kodo skaičius yra didesnis už int max, tačiau galima su kintamuoju 'long'
        long XXaVyroAsmensKodas = 30101010001l;
        long XXaMotersAsmensKodas = 40101010001l;
        long XXIaVyroAsmensKodas = 50101010001l;
        long XXIaMotersAsmensKodas = 60101010001l;
        System.out.println(XXaVyroAsmensKodas);
        System.out.println(XXaMotersAsmensKodas);
        System.out.println(XXIaVyroAsmensKodas);
        System.out.println(XXIaMotersAsmensKodas);

        // 2. Parašykite programą kuri prie maximalios int reikšmės pridėkime 1
        System.out.println(Integer.MAX_VALUE + 1); // išspausdina minimalią 'int' reikšmę
        System.out.println(Integer.MIN_VALUE - 1); // išspausdina maximalią 'int' reikšmę
        System.out.println(Integer.MAX_VALUE - Integer.MIN_VALUE); // išspausdina -1
        System.out.println(Integer.MIN_VALUE - Integer.MAX_VALUE); // išspausdina 1
        System.out.println("------------");

        //Operatoriai
        // 1. Liekana
        int a = 5;
        int b = 2;
        int c = a % b;
        System.out.println(c);
        // 2. Dalyba iš 0
        double d = 2;
        System.out.println(d / 0); // dalyba iš 0 negalima, nebent naudosime kitą kintamąjį kur skaičius galimas po kablelio,
        // 3.
        int x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // kas bus išspausdinta? true
        System.out.println(x <= y && y > 5); // kas bus išspausdinta? false
        System.out.println("abc" instanceof String); // kas bus išspausdinta? true

        // Stringai
        // 1.
        System.out.println("Sveiki Jonai, \nkaip sekasi?");

        //2.
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(lorem);
        //2a. Konvertuokite visą stringą į mažąsias raides.
        System.out.println(lorem.toLowerCase());
        //2b. Konvertuokite visą stringą į didžiąsias raides.
        System.out.println(lorem.toUpperCase());
        //2c. Pakeiskite raides “o” su “z”.
        System.out.println(lorem.replace('o','z'));
        //2d. Parašykite kodą, kuris patikrina ar stringas baigiasi žodžiu “elit”. Pagalvokite ką reiškia, kai stringas pasibaigia žodžiu.
        System.out.println(lorem.endsWith("elit"));
    }
}
