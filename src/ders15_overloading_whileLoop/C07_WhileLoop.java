package ders15_overloading_whileLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {


        //kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //While Loop kullanarak verilen sayinin istene ussunu hesaplayip yazdiran bir method olusturun.


        int sayi=7;
        int us=9;
        ushesapla(sayi,us);
    }

    public static void ushesapla(int sayi,int us){

        int sonuc=1;

        // uslu islemler carpimla ilgili oldugu icin 0 veremeyiz bir degerini verdik.

        while (us>0){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);
    }
}

