package ders45_Maps;

import ders44_maps.MapDepo;

import java.util.HashMap;
import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = new HashMap<>();
/*
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");*/

        //Ogrenci mapinde subesi H olan ogrencilerin isim soyisim ve siniflarini yazdiralim

        ogrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ogrenciMap.put(101,"Adem-Fan-12-T-Soz");
        String subeAdi="H";
        MapDepo.subeOgrenciBilgileriniYazdir(ogrenciMap,subeAdi);


    }
}
