package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_Fibonacci {
    public static void main(String[] args) {

// soru: Kullanicidan pozitif bir tam sayi alip o tam sayidan kucuk fibonacci sayilarini
// bir liste olarak kaydedin ve yazdirin
//0 1 1 2 3 5 8 13 21 34 55 89 144.....


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'den buyuk tam sayi girmalisin");
        }else if(girilenSayi==0) {
            System.out.println("o'dan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi==1) {
            System.out.println("1'den kucuk tek fibonacci sayisi vardir : 0");
        }else{fibonaccisayilariniyazdir( girilenSayi);

        }}

         public static void fibonaccisayilariniyazdir(int girilenSayi){
            //buraya geldiyse fibonacci sayisi 1'den buyuktur

            List<Integer>fibonacciListesi=new ArrayList<>();
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

            int yenifibonaccisayisi=0;
            int index=3;//ilk uc eleman 0,1,1 oldugu icin 3. indexe geldik

            while (yenifibonaccisayisi<girilenSayi){

                yenifibonaccisayisi=fibonacciListesi.get(index-2)+fibonacciListesi.get(index-1);

                if (yenifibonaccisayisi<girilenSayi){
                    fibonacciListesi.add(yenifibonaccisayisi);
                }
            index++;


    }
             System.out.println(fibonacciListesi);

    }
}
