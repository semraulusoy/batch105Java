package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {

        //ogrenci mapinde sirali olarak
        //tum ogrencilerin
        //bolum,sinif,sube,isim,soyisim ve numaralrini yazdirin

        //onceki iki derste key(set) ve Value(Collection)degerlerini toplu olarak alabiliyorduk
        //ancak Key ve Value birlikte kullanmak istedigimizde
        // bu islemi yapmak zordur.

        //bunun icin Java Entry Interface olusturmustur
        //Entryler key=Value ikilisini 1 entry olarak kabul eder.


        Map<Integer,String>ogrenciMap= MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size());//6
        //{101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-11-M-Soz,
        // 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Ayse-Cem-11-M-TM,
        // 106=Fatma-Han-10-K-Soz}


        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);

        //[101=Ali-Can-10-H-MF,
        // 102=Veli-Cem-11-M-Soz,
        // 103=Ali-Cem-11-H-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Ayse-Cem-11-M-TM,
        // 106=Fatma-Han-10-K-Soz]

        //aralarindaki farklar
        //yukaridaki map asagidaki set
        //yukaridakindakinda {} asagidakinde []
        //yukaridakinde key ve valuelar her eleman icin bir arada
        // ama ayri ayri bireyler Entry de ise K=V ikisi birlikte elemen olusturuyor

        //entry seti icerisindeki entryleri biz de sira numarasi vererek yazdiralim
        int siraNo=1;
        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti) {

            System.out.println(siraNo+"- "+eachEntry);
            siraNo++;}
/*
            1- 101=Ali-Can-10-H-MF
            2- 102=Veli-Cem-11-M-Soz
            3- 103=Ali-Cem-11-H-TM
            4- 104=Ayse-Can-10-H-MF
            5- 105=Ayse-Cem-11-M-TM
            6- 106=Fatma-Han-10-K-Soz
            */
 //Entryleri kullanarak keyleri yazdirin
            for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti) {
                System.out.println(eachEntry.getKey());

              /*  101
                102
                103
                104
                105
                106*/
            }

        //Entryleri kullanarak tum ogrencilerin sinifini bir artirin
        //12.sinifta varsa Mapten cikarin
        //tum entryleri elden gecirelim

        String entryValue;
            String[]entryValueArr;
        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti){

            //herbir entry deki value yu alip parcalayip istenen update i yapip
            //yeniden map e eklememiz lazim
            entryValue=eachEntry.getValue();//Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-");//[Ali,Can,10,H,MF]

            if (entryValueArr[2].equals("12")) {
                //ogrencinin sinifi12 ise
                eachEntry.setValue("Mezun oldu");
                }else{
                //ogrencinin sinifi 12 degilse
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+"";//[Ali,Can,11,H,MF]
                eachEntry.setValue(entryValueArr[0]+"-"+
                entryValueArr[1]+"-"+
                entryValueArr[2]+"-"+
                entryValueArr[3]+"-"+
                entryValueArr[4]);
            }
        }
        System.out.println(ogrenciMap);
        //101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-12-M-Soz,
        // 103=Ali-Cem-12-H-TM,
        // 104=Ayse-Can-11-H-MF,
        // 105=Ayse-Cem-12-M-TM,
        // 106=Fatma-Han-11-K-Soz}
        }
}
//Entrylerin indexi olmaz Sette tutuyoruz
// .Entryleri Map ten aldik.
// entry nin  icinden value yi aldik.
// value yu array e bolduk
// valuenun arrayinin indexini aldik.