package ders35_Exceptions;

import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {


        //Kullanicidan bir tam sayi alin ve sayinin karesini yazdirin
        //Kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip tekrar sayi isteyin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tam bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println("girdiginiz sayinin karesi");
        System.out.println(girilenSayi*girilenSayi);
    }
}
