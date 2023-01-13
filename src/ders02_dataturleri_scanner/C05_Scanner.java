package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        // soru kullanicidan bir double bir de int sayi alip
        //bunlarin toplamini ve carpimini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir ondalikli sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int tamSayi= scan.nextInt();


        System.out.println("Girilen sayilarin toplami : " +(ondalikliSayi+tamSayi));

        System.out.println("Girilen sayilarin carpimi : " +(ondalikliSayi*tamSayi));
    }
}
