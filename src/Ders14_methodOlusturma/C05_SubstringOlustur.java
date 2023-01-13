package Ders14_methodOlusturma;

public class C05_SubstringOlustur {
    public static void main(String[] args) {


        /*Kullanicidan input olarak  bir String baslangic ve bitis indekslerine gore
        baslangic indeksi dahil bitis indeksi haric olacak sekilde aradaki harfleri yazdiran bir method olusturun
        kullanici baslangic degeri olarak,bitis degerinden buyuk sayi girerse hata mesaji verin
        kullanici strda olan indekslerden daha buyuk bir index girerse hata mesaji yazdirin
         */

        String input="Java ne kadar guzel";
        int basIndeksi =5;
        int bitisIndeksi=7;
        kendiSubstrinMethodumuz(input,basIndeksi,bitisIndeksi);

    }

    public static void kendiSubstrinMethodumuz(String input,int basIndeksi, int bitisIndeksi){
        if (basIndeksi>bitisIndeksi){
            System.out.println("baslangic indeksi bitis indeksinden buyuk olamaz");}
        else if (bitisIndeksi > +input.length()) {
            System.out.println("bitis indeksi String sinirlari disinda ");}
        else{
                for (int i = basIndeksi; i <bitisIndeksi; i++) {
                    System.out.print(input.charAt(i));}
            System.out.println(" ");


                }

            }
            }



