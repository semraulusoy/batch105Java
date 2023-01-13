package ders10_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {


        String str= "Java ile kodlama cok zevkli";


       // bir Stringin baska bir stringi icerip icermedigini kontrol eder
        // boolean sonuc dondurur.
        // aranan stringin kac tane oldugunu tespit edemez
        // sadece var veya yok cevabi verir.
        //contains char parametre kabul etmez aranan charsequence yani string olmalidir.
        //charsequence char dizisi



        System.out.println(str.contains("Java"));//true

        System.out.println(str.contains("java"));//false

        System.out.println(str.contains("cok"));//true

        System.out.println(str.contains("a"));//true

        //System.out.println(str.contains('a')); char olarak kabul etmez

        System.out.println(str.contains(" "));//true

        System.out.println(str.contains(""));//true

        String str2="Java";

        System.out.println(str.contains(str2));//true
    }
}
