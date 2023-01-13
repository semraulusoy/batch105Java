package ders15_overloading_whileLoop;

public class C08_RakamlarToplami {
    public static void main(String[] args) {

        //WhileLoop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;


        while(sayi!=0){

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);
    }
}
