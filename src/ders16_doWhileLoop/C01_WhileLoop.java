package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {


        //10,11,12 sayilarini toplayan bir whileloop olusturalim


        int sayi=10;
        int toplam=0;
        while(sayi<=10){
            toplam+=sayi;
            sayi++;
//whileLoop ta once kontrol sonra islem yapilir.
        }
        // while loop ta iki problem olusabilir
        // once degeri kontrol edip islem yapildiginda bodyde tekrar
        // kontrol etmemiz gerekir bu da fazladan islem yapilmis olur.
        //yapilan islem sayisindan bir fazla while bitis sarti kontrol edilir.
        //whileloop baslangicta yanlis bir deger atarsak while loop calismayabilir.
    }
}
