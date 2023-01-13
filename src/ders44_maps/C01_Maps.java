package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

       Map<Integer,String >ogreciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogreciMap);
//{101=Ali-Can-10-H-MF,
// 102=Veli-Cem-11-M-Soz,
// 103=Ali-Cem-11-H-TM,
// 104=Ayse-Can-10-H-MF,
// 105=Ayse-Cem-11-M-TM,
// 106=Fatma-Han-10-K-Soz}

        //104 degerindeki keyin value'sunu getirir.

        System.out.println(ogrenciMap.get(104));//Ayse-Can-10-H-MF


        //105 numarali ogrencinin isim ve soyismini yazdirin

        int ogrenciKey=105;

String isimSoyisim=MapDepo.isimSoyisimdondur(ogreciMap,ogrenciKey);
        System.out.println(ogrenciKey+"nolu ogrenci isim ve soyismi : "+isimSoyisim);//Ayse Cem

    }
}

//Map key-value pairs (ikilileri)kullanir.
//her bir element icin bir key bir value olmasi gerekir.
//elementler key icinde tutuldugundan keylerin unique olmasi gerekir.
//Value icin uniqe olma mecburiyeti yoktur
// Value string bir ifadeye eklenecek bir cok bilgiyi icerebilir ama
// map  value olarak tek bir deger store eder.
//map deklare ederken key ve value nun ne oldugunu belirtmemiz lazim genelde
//Map<Integer,String>ogrenciMap=new HashMap<>();
//add. yerine put. kullanilir.
//ise yarayacak kullanacagimiz methodlari mapdepoda hazirliyoruz.