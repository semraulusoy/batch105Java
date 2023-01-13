package ders09_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {

    public static void main(String[] args) {


        String str="Java Mutluluktur";
        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR
        System.out.println(str);//Java Mutluluktur
        //su anda yaptigimiz islem kalici olmadi kalici olmasi icin atama yapilmasi gerekir.
        str=str.toUpperCase();
        System.out.println(str);

        str="ince memet";
        str=str.toUpperCase();
        System.out.println(str);//INCE MEMET
        //str=str.toLowerCase();
        //System.out.println(str);//ince memet
        //turkce olarak I ya cevirmek istersen
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));



    }
}
