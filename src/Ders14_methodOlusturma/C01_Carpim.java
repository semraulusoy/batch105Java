package Ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    public static void main(String[] args) {


        //main method icerisinde kullanicidan iki sayi alin
        //bu iki sayiyi parametre kabul edip carpimlarini main methoda donduren
        // bir method olusturun.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki tam sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println(carpimMethodu(sayi1,sayi2));

    }

    public static double carpimMethodu(double sayi1,double sayi2){
        System.out.println("method basariyla calisti");

        return sayi1*sayi2;
    }

}

