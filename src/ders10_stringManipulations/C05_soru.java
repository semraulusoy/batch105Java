package ders10_stringManipulations;

import java.util.Scanner;

public class C05_soru {
    public static void main(String[] args) {
        //mail kontrolu yapan bir program hazirlayin
        //1.mail@ isareti icermiyorsa "gecersiz email"
        //2.@gmail.com icermiyorsa "gmailadresi giriniz"
        //3.@gmail.com ile bitmiyorsa "yazim hatasi" seklinde sonuc yazdiriniz


        String email = "semraulusoy@gmail.com";
        if (!email.contains("@")) {
            System.out.println("gecersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        } else {
            System.out.println("email basari ile kaydedildi");

        }


    }}
