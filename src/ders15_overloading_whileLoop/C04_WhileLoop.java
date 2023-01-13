package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {


        // kullanicidan toplanmak uzere tamsayilar alin
        // kullanici 0'a basarsa sayi alma islemini bitirin
        //kullanicinin kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin
        //kac tane tam sayi girilecegi bilinmedigi icin forloop cok kullanisli olmaz

        Scanner scan=new Scanner(System.in);

        int girilenSayi=5;// verilen ilk deger bu soru icin sifir olmamali
                           // cunku 0 loopu bitirmek icin kullanilacak istediginiz bir sayiyi koyabilirsiniz

        int sayac=0;
        int toplam=0;


        while(girilenSayi!=0){
            System.out.println("lutfen toplamak icin tam sayi giriniz"+"\nBitirmek icin 0'a basin");

            girilenSayi= scan.nextInt();

            if(girilenSayi!=0){
                sayac++;
                toplam=toplam+girilenSayi;}



            }
        System.out.println("girilen"+sayac+"adet sayinin toplami"+toplam);






    }
}
