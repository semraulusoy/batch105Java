package ders08_Ternary_switch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {


        //kullanicidan bir sayi alin
        //sayi pozitif ise 2 katini yazdirin
        //sayi pozitif degilse sayiya 10 ekleyin yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz ");
        double sayi=scan.nextDouble();

        if(sayi>0){
        System.out.println(sayi*2);
    }else{
        System.out.println(sayi+10);
    }

        System.out.println(sayi>0?2*sayi:sayi+10);
}}


/*ternary metodu if else ile yapabilecegimiz basit islemleri daha basit formda kodlama imkani verir

komplex kodlarda ternary kullanilmasi tavsiye edilmez.
if(a>0){a*=2}else {a+=10;}
a=a>0?a*2:a+10:

 */



