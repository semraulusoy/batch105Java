package Ders14_methodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {


        int a=10;
        int b=20;

        //bu iki sayinin carpim sonucunu kod yazmadan konsola yazdirin.
        System.out.println(C01_Carpim.carpimMethodu(a, b));

        String c="Nasil";
        String d="yani";
        // bu iki Stringi aralarinda bir bosluk olacak sekilde yazdiriniz

        System.out.println(C02_StringConcate.birlestirmeMethodu(c, d));


        String e= "Bu da mi oldu?";// e Stringini tersten yaziniz

        System.out.println(C03_StringTerseCevirme.TerscevirmeMethodu(e));
String input="Bu cumleyi terse cevirin";
        //"bu cumleyi terse cevirin"
        System.out.println( C03_StringTerseCevirme.TerscevirmeMethodu(input));


        //stri buyuk harf olarak yazdirin
        String str="Java cok guzel";

        System.out.println(str.toUpperCase());
    }


}
