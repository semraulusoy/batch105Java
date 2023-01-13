package ders04_matematikselislemler_incrementdescrement;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        // kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tam sayi kismini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        int bolmeSonucutamsayi= (int)(sayi1/sayi2);
        System.out.println( bolmeSonucutamsayi);
    }
}
