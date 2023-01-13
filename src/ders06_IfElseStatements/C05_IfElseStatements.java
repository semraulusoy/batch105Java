package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {


        //kullanicidan yasini isteyin 65 yas ve uzeri ise "emekli olabilirsin"yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");

        int yas=scan.nextInt();
         if (yas>=65){
             System.out.println("emekli olabilirsin");

    }else {
             System.out.println("emekli olman icin "+(65-yas)+"sene daha calismalidir");
}
    }
}
