package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {


        //kullanicidan bir tam sayi aliniz
        //sayi negatif ise "gecersiz sayi"
        //tek basamakli ise "rakam"
        //iki basamakli ise "iki basamakli sayi"
        //bunun disindaki sayilar icin "Buyuk sayi yazdirin

        Scanner scan= new Scanner(System.in);
        int sayi=scan.nextInt();

        if (sayi<0){
            System.out.println("gecersiz sayi");}
        else if (sayi>=0&&sayi<10) {
            System.out.println("rakam");}
        else if (sayi>=10&&sayi<=99) {
            System.out.println("iki basamakli sayi");}
        else {
            System.out.println("Buyuk sayi");

        }

    }


    }

