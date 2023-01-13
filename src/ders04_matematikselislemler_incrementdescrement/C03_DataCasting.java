package ders04_matematikselislemler_incrementdescrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {
        // kullanicidan iki integer deger alip bunlari birbirine bolun ve sonucu double olarak yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println(" lutfen iki tam sayi giriniz ");

        int sayi1= scan.nextInt();//20

        int sayi2= scan.nextInt();//6

        System.out.println(sayi1/sayi2);//(double)(3)= 3.0
        double ondalikliSonuc=(double)(sayi1/sayi2);  //3.0

        System.out.println(ondalikliSonuc);// sonucun double olmasi icin sayilardan en azindan birinin double olmasi lazim

    double dogruSonuc= (double)sayi1/sayi2;  //double/int=== genis olana gore sonuc verir
        System.out.println(dogruSonuc);

    }
}
