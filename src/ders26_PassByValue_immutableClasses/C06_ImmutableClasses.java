package ders26_PassByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class C06_ImmutableClasses {


    //Java da bir class baska classlar tarafindan da kullanilacaksa degeri degistirilmesin
    // diye immutable yapilir
    // bir class immutable ise ondan olusan objeler de ummutable dir
    //ornegin bankadan stilan dovize yapilan indirim her islemde yapilmasin diye class immutable yapilir
    //doviz kurunu immutable yaparsak ne kadar deger atanirsa atansin degeri degismez
    //immutable objeler ilk deger atanirken atamasi yapilir sonradan degistirlemez ya da yeni degervatanamaz
    //en cok kullanilan classlar immutable classlar String ve wrapper classlardir

    public static void main(String[] args) {


        String str="Java Guzeldir";
        System.out.println(str.toUpperCase());//JAVA GUZELDIR
        System.out.println(str); //Java Guzeldir
        str.toLowerCase();
        System.out.println(str);//Java Guzeldir

        //String immutable class oldugundan method ile yapilan degisiklikler String'i kalici degistirmez.

        List<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");

        harfler.remove(0);
        System.out.println(harfler);//[B]

        //List ve array mutable olduklari icin methodla yapilan degisiklikler kalici olur

    }

}
