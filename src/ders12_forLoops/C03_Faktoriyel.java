package ders12_forLoops;

public class C03_Faktoriyel {
    public static void main(String[] args) {

        //kullanicinin verdigi sayinin faktoriyelini bulunuz
        //5!=5*4*3*2*1=120


        int sayi = 10;
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(faktoriyel);

        //1'den 100'e sinirlar dahilkadar olan sayilari toplayin


        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam = toplam + i;
        }

        System.out.print(toplam);
    }



        }


