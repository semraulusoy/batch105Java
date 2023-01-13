package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {


        //soru  kullanicidan cinsiyetini ve yasini alin,kadin 60 yas uzeri
        //erkek 65 yas uzeri emekli olabilir
        //cinsiyet ve yasini dikkate alarak
        //"emekli olabilirsin" veya "emekli olamazsin"yazdirin
        //ana degisken yas olsun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz" );
        double yas= scan.nextDouble();
        System.out.println("lutfen cinsiyetinizi giriniz E/K");
        char cinsiyet=scan.next().charAt(0);

        if (yas<15){
            System.out.println("hatali yas girisi");
        } else if (yas<60) {
            System.out.println("emekli olamazsin");
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("daha " + (60 - yas) + "sene calismalisin");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("daha" + (65 - yas) + "sene calismalisin");
            } else {
                System.out.println("hatali cinsiyet girisi");
            }
        }else{
            System.out.println("emekli olabilirsin");


            }

        }
    }

