package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {



        // kullanicidan bir dikdorgenin iki kenar uzunlugunu alip
        // dikdortgenin alanini yazdirin .

        Scanner scan = new Scanner (System.in);

        System.out.println("lutfen dikdortgenin  iki kenar uzunlugunu girin" +
                "\niki kenar uzunlugu arasinda enter a basin ");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdortgenin alani : " + (kenar1*kenar2));
        }
    }
