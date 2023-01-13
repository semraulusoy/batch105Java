package ders07_NestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        //soru  kullanicidan cinsiyetini ve yasini alin,kadin 60 yas uzeri
        //erkek 65 yas uzeri emekli olabilir
        //cinsiyet ve yasini dikkate alarak
        //"emekli olabilirsin" veya "emekli olamazsin"yazdirin

        //Nested if else kullanimiicin once ana degiskeni secip
        //ona gore ana yapiyi olusturalim
        //cinsiyet ana degisken olsun

        char cinsiyet='k';
        int yas=90;

        if (cinsiyet=='k'||cinsiyet=='K')
        {if (yas<15) {

            //giris yapilan deger kadina ait

            System.out.println("hatali yas girisi");
        } else if (yas<60) {
            System.out.println("emekli olamazsin"+(60-yas)+"yil calismalisin");
        }else {
            System.out.println("emekli olabilirsin");


            if (cinsiyet == 'e' || cinsiyet == 'E') {
                if (yas < 15)
                    System.out.println("hatali yas girisi");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin" + (65 - yas) + "yil daha calismalisin");
            } else {

                System.out.println("emekli olabilirsin ");

                //giris yapilan deger erkege ait


            }

        }}}}

