package ders44_maps;

import com.sun.jdi.Value;

import java.util.*;

public class MapDepo {
    //main methoda ihtiyaci yok sadece methodlari depolamak icin kullanacagiz.


    //ogrenci map olusturup bize donduren bir method olusturun

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");


        return ogrenciMap;


    }

    public static String isimSoyisimdondur(Map<Integer, String> ogreciMap, int ogrenciKey) {

        //{101=Ali-Can-10-H-MF,
// 102=Veli-Cem-11-M-Soz,
// 103=Ali-Cem-11-H-TM,
// 104=Ayse-Can-10-H-MF,
// 105=Ayse-Cem-11-M-TM,
// 106=Fatma-Han-10-K-Soz}

// ogrenciKey=105

        String ogrenciValue = ogreciMap.get(ogrenciKey);//Ayse-Cem-11-M-TM
        String[] valueArr = ogrenciValue.split("-");//[Ayse,Cem,11,M,TM]
        String isimSoyisim = valueArr[0] + " " + valueArr[1];//Ayse Cem

        return isimSoyisim;


    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yenisube) {

        //istenen Key varsa update edip yeni mapi dondurcez
        //yoksa gelen mapi aynen  geri dondurcez

        //ogrenci key map te varmi?(Contains)


        if (ogrenciMap.containsKey(ogrenciKey)) {
            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey);//Ayse-Can-10-H-MF
            String[] istenenKeyValueArr = istenenKeyinValuesu.split("-");//[Ayse,Can,10,MF]
            //yeni sube degerini atayalim
            istenenKeyValueArr[3] = yenisube;//[Ayse,Can,10,MF]
            String istenenKeyinyeniValuesu = istenenKeyValueArr[0] + "-" +
                    istenenKeyValueArr[1] + "-" +
                    istenenKeyValueArr[2] + "-" +
                    istenenKeyValueArr[3] + "-" +
                    istenenKeyValueArr[4];

            ogrenciMap.put(ogrenciKey, istenenKeyinyeniValuesu);
        }


        return ogrenciMap;
    }


    public static void subeOgrenciBilgileriniYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {


        Collection<String> valueCollection = ogrenciMap.values();

         /*
        {101=Ali-Can-10-H-MF,
         102=Veli-Cem-11-M-Soz,
          103=Ali-Cem-11-H-TM,
          104=Ayse-Can-10-H-MF,
          105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}
         */
        //herbir value yu alicam parcaliycam kontrol edip subesi H olani yazdircam .
        //herbir valueyu for each loop la ele aliriz
        System.out.println("isim     soyisim       sinif");
        System.out.println("=============================");
//ahmetbulutluoz printf diye videosunuda duzgun yazilimini izle
        for (String eachValue : valueCollection
        ) {
            //value yu parcalarina ayir
            // parcalarina arrayle ayiririz
            String[] valueArr = eachValue.split("-");//[Ayse,Can,10,H,MF]


            //sube ismini kontrol et istenen sube ise isim soyisim sinif yazdir

            //istersek bunlari bir listeye koyar onu main methoda dondururduk
            //
            if (valueArr[3].equals(subeAdi)) {
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }


    }

    public static List<String> numaraDegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
//hem key, hem de value lazim oldugundan keyseti olusturduk
        //sonra o key uzerinden valueyu map den aldik


        Set<Integer>ogrenciKeySeti=ogrenciMap.keySet();


        //keyleri valuleri elde ettik sinir key e gore ama yazdiracagim seyler value ya gore
        //once butun keyleri gozden gecirip o sinirlarin icerisindeki keylerin value larini alip
        // parcalayip istedigim bilgileri alip birlestirip listeye eklemeliyim
        // once dondurecehgimiz bir liste lazim

        List<String>isimListesi=new ArrayList<>();
        //Key degerlerini tek tek elden gecirelim
        //istene aralikta olanlari bulalim
         String value;
         String[]valueArr;
         String istenenIsim;

        for (Integer eachKey:ogrenciKeySeti
             ) {if (basNo<=eachKey&&eachKey<=bitNo){
             //buraya verilen sinir degerlerine uyan
            //eachKey ler gelecek
            //sinira uygun keyin valuesunu alalim
            //bu eachin icindeki keyin valuesunu alacagiz.
            value =ogrenciMap.get(eachKey);//Ayse-Can-10-H=MF
            //valueyu parcalara ayirdik
            valueArr= value.split("-");//[Ayse,Can,10,H,MF]
            //value arrayinden listeye eklenecek bilgileri alalim
            istenenIsim=valueArr[0]+" "+valueArr[1]+" "+valueArr[4];

            //istenen ismi olusturduk bunu listeye ekleyelim

            isimListesi.add(istenenIsim);
        }
    }
return isimListesi;
}

    public static void numaraIsimSoyisimYazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer>keySeti=ogrenciMap.keySet();
        String value;
        String []valurArr;

        for (Integer eachKey:keySeti
             ) {
            value=ogrenciMap.get(eachKey);
            valurArr=value.split("-");
            System.out.println(eachKey+" "+valurArr[0]+" "+valurArr[1]);

        }
    }

    public static Set<String> siraliogrenciListesiOlustur(Map<Integer, String> ogrenciMapi) {
        Set<String>siraliOgrenciSeti=new TreeSet<>();
        //tum elementlerin key ve valu lerine birlikte ihtiyac oldugundan
        //entry kullanmaliyiz.
        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMapi.entrySet();
        //her bir entryi elden gecirip
        //bilgileri istedigimiz formatta alalim

        String istenenBilgi;
        String value;
        String[]valueArr;


        for (Map.Entry<Integer,String >eachEntry:ogrenciEntrySeti
             ) {
           //101=Ali-Can-10-H-MF Entry
           //bolum,sinif,sube,isim,soyisim ve numaralarini yazdirin

            value=eachEntry.getValue();
            valueArr=value.split("-");//[Ayse,Can,10,H,MF]


            istenenBilgi=valueArr[4]+", "+valueArr[2]+", "+valueArr[3]+", "
                    +valueArr[0]+", "+valueArr[1]+", "+eachEntry.getKey();

siraliOgrenciSeti.add(istenenBilgi);
            //Map'de herhangi bir degisiklik istenmediginden
            //arrayi yeniden birlestirip entry.setValue()yapmamiza gerek yok

        }

        return  siraliOgrenciSeti;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMapi) {

        String istenenBilgi;
        String value;
        String[]valueArr;


        //soyisimleri buyultmek icin once Entry set alalim

        Set<Map.Entry<Integer,String>>ogrenciEntrySeti=ogrenciMapi.entrySet();

        //entrySettdeki her bir entrydeki value yu alalim

        for (Map.Entry<Integer,String>eachEntry:ogrenciEntrySeti
             ) {
            value=eachEntry.getValue();

            //Value yu split yapip arraye cevirelim
            valueArr=value.split("-");

            //arrayde istedigimiz degisikligi yapalim
            valueArr[1]=valueArr[1].toUpperCase();

            // arraydeki yeni bilgileri birlestirip eachRntry.setvalue(yeniValue)


            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4]);

        }


        return ogrenciMapi;
    }
}
