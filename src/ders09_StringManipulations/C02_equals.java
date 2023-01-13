package ders09_StringManipulations;

public class C02_equals {
    public static void main(String[] args) {
        String str1="Ali";
        String str2="ali";


        String str3=new String("Ali");
        String str4="Ali";
        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true

        /* double eguals
        ==stringleri karsilastirirken bekledigimiz sonuclari vermeyebilir
        Stringlerde metinlerin ayni olup olmadigini karsilastirmak icin
        iki tane esittir isareti yerine eguals() kullanilir.
         */

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true






    }
}
