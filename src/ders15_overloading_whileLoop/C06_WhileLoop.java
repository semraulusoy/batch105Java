package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

       //Kullanicidan sifre isteyin
        // asagidaki sartlari saglamayan sifrelerde
        // hatalari yazdirip
        // kullanicinin yeni sifre girmesini isteyin
        // gecerli sifre yazilincaya kadar bu islemi tekrar edin
        // gecerli sifre yazilinca "sifreniz basariyla kaydedildi" yazdirin sartlar
        // -sifrenin ilk karakteri kucuk harf olmali
        // - sifrenin son karakteri sayi olmali

        Scanner scan=new Scanner(System.in);
        boolean sifreGecerliMi=false;
        String sifre="";
        int bayrak=0;


        while(sifreGecerliMi!=true){

            System.out.println("Lutfen sifrenizi giriniz");
            sifre=scan.nextLine();
            bayrak=0;

            if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
                System.out.println("sifrenin ilk harfi kucuk harf olmali");
            bayrak++;}
            if (!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("sifrenin son karakteri sayi olmali");
            bayrak++;}
//simdi else yazamayiz iki bagimsiz if varsa else kullanamayiz onun yerine bayrak kullaniriz

          if(bayrak==0){
              sifreGecerliMi=true;
              System.out.println("sifreniz basari ile kaydedildi");}


                //else yapamayiz o zaman ikisinden biri calisir o yuzden bagimsiz if cumleleri olmali
            }

        }
    }
