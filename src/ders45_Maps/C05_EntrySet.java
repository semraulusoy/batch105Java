package ders45_Maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C05_EntrySet {
    public static void main(String[] args) {

        //ogrenci Mapinden Numara,isim ve soyisim degerlerini yazdiralim
        //keyleri ayri elde ederim o keylerin valuelarini alir yazdiririm

        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        ogrenciMap.put(110,"Suleyman-Sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);
        /*
101 Ali Can
102 Veli Cem
103 Ali Cem
104 Ayse Can
105 Ayse Cem
106 Fatma Han
update edip tekrar yazdirdik
101 Ali Can
102 Veli Cem
103 Ali Cem
104 Ayse Can
105 Sule Karaca
106 Fatma Han
110 Suleyman Sah
*/

    }
}
