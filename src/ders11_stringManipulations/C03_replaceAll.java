package ders11_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {




        //strdaki sayilari silip metni Java guzeldir yazdir.
        //str.replaceAll sadece bir harf yada char sequence i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir

        //replaceFirst bir stringin icinde bulunan degisecek strinlerden ilkini yeni deger yapar .
        // degisecek strin string olabilecegi gibi regex (regular expressions) de olabilir

        String btr="herkesin github'u olmali";
        System.out.println(btr.replaceFirst("e","a"));//Harkesin githu'u olmali
        System.out.println(btr.replaceFirst("\\w","1"));//1erkesingithub'u olmali

        /*  regex
        \\s: space
        \\S: space olmayan hersey
        \\s+: yanyana birden fazla space
        \\d: digits
        \\D: digit olmayan hersey
        \\w: harf veya rakam
        \\W: harf veya rakam olmayan hersey
         */

        String str="J1ava2 G9uzel5dir8";
        System.out.println(str.replaceAll("\\d",""));//Java guzeldir
        System.out.println(str.replaceAll("\\D",""));//12958

        String s1="ilk urun fiyati : 1250 tl ";
        String s2="ikinci urun fiyati : 1500 tl ";
        //iki urunun fiyatini toplayin

       s1= s1.replaceAll("\\D","");
        s2=s2.replaceAll("\\D","");

        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750


        // stringi integere cevirmek icin Integer.parse int deriz
        //method overloadingin amaci ayni islevi farkli sekilde gerceklestirebilmektir







    }
}
