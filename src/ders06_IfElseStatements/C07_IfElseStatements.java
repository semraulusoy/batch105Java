package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {


        //kullanicidan bir harf isteyiniz
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
        // yoksa gorulen harfi yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

                char harf=scan.next().charAt(0);

              if (harf>='a'&&harf<='z'){

                  //kucuk harf girildi demektir.
                  System.out.println((char)(harf-32));
              }else {
                  System.out.println(harf);

    }
}}
