package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // kullanicidan ismini alip buyuk harflerle yazdirin


        //1. adim scan objesi olusturmak

        Scanner scan = new Scanner (System.in);

        //2.adim kullaniciya ne istedigimizi yazdirma

        System.out.println("lutfen adinizi giriniz");

        //3. adim kullanicidan istedigimiz bilginin turune uygun
        // bir variable olusturup scanner metodlarindan uygun olanini
        // kullanarak alinan degeri variable a atayalim

        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());
    }
}
