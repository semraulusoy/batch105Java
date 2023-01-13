package ders09_StringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {


        String str1="Ali";
        String str2="ali";
        String str3="ALI";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false

      // eguals metodunda buyuk kucuk harf duyarliligi vardir tamamen ayni olmazsa metinlere esit demez
      //eger sadece metinler ayni olsun buyuk kucuk harf onemli degil denirse equalsIgnoreCase kullanilir.
        // egualsignorecase kelimedeki farkliliklari tolere etmez a li ile ali birbirine esit degildir ali ali. da esit degildir



        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str1.equalsIgnoreCase("Ali "));//false
        System.out.println(str1.equalsIgnoreCase("Ali Can"));//false
    }
}
