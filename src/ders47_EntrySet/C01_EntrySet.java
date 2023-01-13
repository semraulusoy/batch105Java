package ders47_EntrySet;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        //Ogrenci ma```p inde sirali olarak
        //tum ogrencilerin
        //bolum,sinif,sube, isim, soyisim ve  numaralarini yazdirin


        //onceki iki derste key(set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        //ancak key ve value birlikte kullanmak istedigimizde
        //bu islemi yapmak zor olur

        //bunun icin Java Entry interface ini olusturmustur.
        //Entry'ler key==Value ikilisini 1 Entry olarak kabul ederler.


        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size());//6

        /*{101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */

        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);
        /*
        [101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz]
         */

        //
        // ustteki Map alttaki Set
        // Map olarak yazdirinca suslu parantezle asagidakinde Entry olarak yazdirdigimizda arrayde yazar
        //yukarudakinde key ve value lar her eleman icin bir aradda ama ayri ayri bireyler
        //asagidakinde ise key=Value ikisi birlikte bir lemenet olusturuyor.
    }
}
