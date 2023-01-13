package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {


        // kullanicidan iki sayi alip ikisinin degerini degistirin (swap)


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birinci tam sayiyi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen ikinci tam sayiyi giriniz ");
        int sayi2= scan.nextInt();
        // kum kovasi metodu
        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;
        System.out.println("sayi1 in degeri"+ sayi1);

        System.out.println("sayi2 nin degeri : " + sayi2 );



    }
}
