package ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {
    //soru  kullanicidan cinsiyetini ve yasini alin,kadin 60 yas uzeri
    //erkek 65 yas uzeri emekli olabilir
    //cinsiyet ve yasini dikkate alarak
    //"emekli olabilirsin" veya "emekli olamazsin"yazdirin

    char cinsiyet='e';
    int yas=15;


    if (cinsiyet=='e'&&yas>=65){
        System.out.println("emekli olabilir");
    } else if (cinsiyet=='e'&&yas<65&&yas>15){
        System.out.println("emekli olamak icin daha "+(65-yas)+"sene calismalisin");}
    else if (cinsiyet=='k'&&yas>=60) {
        System.out.println("emekli olabilirsin");
    } else if (cinsiyet=='k'&&yas<60&&yas>15) {
        System.out.println("emekli olmak icin" + (60 - yas) + "sene calismalisin");
    }else{
        System.out.println("gecersiz giris");


    }

    }
    }







