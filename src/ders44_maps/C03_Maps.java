package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();
        //8.satirdan sonra Map uzerinden yapacagimiz her degisiklik bu classtaki ogrenci Map i etkiler
        // depodaki degerlerle alakali degildir

        //Map e iki tane yeni element ekleyelim.

        //Mapin bu halini bir gorelim

        System.out.println(ogrenciMap);

        //{101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-11-M-Soz,
        // 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Ayse-Cem-11-M-TM,
        // 106=Fatma-Han-10-K-Soz}

        //Mape bir tane yeni eleman ekleyelim
        ogrenciMap.put(110,"Fatih-Yan-10-T-MF");
        //102 numarali ogrenciyi update edelim
        ogrenciMap.put(102,"Veli-Dem-12-D-Soz");
        System.out.println(ogrenciMap);
        //103 nolu ogrencinin isim ve soyisimi yazdirin

        System.out.println(MapDepo.isimSoyisimdondur(ogrenciMap, 103));//Ali Cem

        //105 numarali ogrencinin subesini S yapin

      ogrenciMap=(MapDepo.ogrenciyeYeniSubeAta(ogrenciMap, 105,"S"));
        System.out.println(ogrenciMap);

        /*{101=Ali-Can-10-H-MF,
           102=Veli-Dem-12-D-Soz,
           103=Ali-Cem-11-H-TM,
           104=Ayse-Can-10-H-MF,
           105=Ayse-Cem-11-S-TM,
           106=Fatma-Han-10-K-Soz,
           110=Fatih-Yan-10-T-MF}
         */
    }
}
