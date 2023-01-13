package ders23_constructors;

import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {


        //Scanner classin daki method ve variable lari (ozellikleri) kullanmak icin scan objesi olusturulur.


        Scanner        scan             =          new                        Scanner(System.in);
      //calss adi     obje ismi           obje olusturmak icin keywoed        Scanner Constructor'i


        scan.nextInt();

        String str= new String("Java Candir");
        String str2="Java ne guzel";

        str.toLowerCase();


       // olusturdugunuz objenin hangi ozelliklere sahip oldugunu constructor belirler

       //Java'da obje olusturuldugunda alacagi ilk degerlerin ne olacagini initialize constructor lar ile duzenleriz.

        // Java daolusturulan bir objeye farkli constructor ile ilk  deger atamasi yaparak
        // ayni classsdan farkli ozelliklere sahip objeler olusturulur.
        //her bir class objeler icin bir kaliptir.

        //lego modeli ayni kaliptan farkli ozellikte objeler uretilebilir.
        //hicbir ozellik belirtmezsek parametresiz bir constructor kullanilir.
        //istersek () parantesin icine yazacagimiz parametrelerle obje olustururken ozellikleri belirleye biliriz.

        //Constructorlar syntax olarak methodlara benzer ama return typrelari yoktur.
        //ismi class ismi ile ayni olmak zorundadir.(Buyuk harfle baslar data overloading yaparak
        // yani parametreleri artirarak istedigimiz kadar constructor olusturabiliriz )

        //genelde method isimlerini class isimleriyle ayni yapmayiz ve method isimleri kucuk harfle baslar.

    }
}
