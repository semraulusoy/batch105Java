package ders44_maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {


        Map<Integer,String>ogrenciMap=MapDepo.ornekMapOlustur();
        ogrenciMap.put(105,"Hasan-Can-11-K-MF");
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");
        System.out.println(ogrenciMap);
/*
        {101=Ali-Can-10-H-MF,
         102=Veli-Cem-11-M-Soz,
         103=Ali-Cem-11-H-TM,
          104=Ayse-Can-10-H-MF,
          105=Hasan-Can-11-K-MF,
          106=Fatma-Han-10-K-Soz,
          108=Hikmet-Han-10-M-TM}

          eger mapte olan bir key ile yeni bir deger eklerseniz o Keye ait eski deger silinir ve yeni valu gecerli olur
          olmayan bir key eklersek sona onu ekler
 */

        //108 numarali ogrencinin isim ve soyismini yazdirin

        System.out.println(MapDepo.isimSoyisimdondur(ogrenciMap,108));//Hikmet Han


        //104 numarali ogrencinin subesini K yapin.
        //methodda istenen Key Mapte varsa degistirip Mapi geri dondurelim
        // yoksa hic bir islem yapmadan Mapi geri dondurelim
        int ogrenciKey=109;
        String yenisube="K";
      MapDepo.ogrenciyeYeniSubeAta(ogrenciMap,ogrenciKey,yenisube);
        System.out.println(ogrenciMap);

        //ogrenci key gonderilecek varsa degistirip true gonderecek yoksa false gonderecek


    }
}
