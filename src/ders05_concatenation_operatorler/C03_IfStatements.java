package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // kullanicidan iki sayi alin
        //eger birinci sayi 100den buyukse ilk sayi yuzden buyuk yazdirin
        //eger ikinci sayi ciftse ikinci sayi cift yazdirin
        //eger ikinci sayi ilk sayidan buyukse ilk sayi daha buyuk yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen iki tam sayi giriniz");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();


        //eger birinci sayi 100den buyuk se, "ilk sayi 100 den buyuk" yazdirin

        //
        if (s1 > 100) {
            System.out.println("ilk sayi 100'den buyuk");

        }
        //eger ikinci sayi ciftse ikinci sayi cift yazdirin

        if (s2 % 2 == 0) {
            System.out.println("ikinci sayi cift ");

        }

        //eger ikinci sayi ilk sayidan buyukse ilk sayi daha buyuk yazdirin


        if (s1>s2){
            System.out.println("ilk sayi daha buyuk");
        }
    }}




