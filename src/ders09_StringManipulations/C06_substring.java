package ders09_StringManipulations;

import java.util.Locale;

public class C06_substring {
    public static void main(String[] args) {


        String str="Java ogren, isi kap";

        System.out.println(str.substring(5));// ogren ,isi kap
        System.out.println(str.substring(0));//java ogren, isi kap
        System.out.println(str.length());//19

        //son karakteri String olarak kaydedin
        System.out.println(str.charAt(str.length()-1));//bana son harfi char olarak verir ama string olarak istiyor.


        String sonharf= str.substring(str.length()-1);
        System.out.println(sonharf);//p

        sonharf=str.substring(str.length()-1);
        System.out.println(sonharf);

        //son indeksteki karakteri uppercase olarak yazdirin

        System.out.println(str.substring(str.length()-1).toUpperCase(Locale.ROOT));

        //son uc harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP




        /*substing alt strinler demektir. iki tane substring methodu vardirbir tanesi sadece baslangic indeksini ister
        digeri baslangic ve bitis indeksini ister

         */

    }
}
