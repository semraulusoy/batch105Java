package ders45_Maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        // Ogrenciler mapinde subesi H olan ogrencilerin isim soy isim ve siniflarini yazdiralim

        Map<Integer, String> ogrenciMap = MapDepo.ornekMapOlustur();
        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
         102=Veli-Cem-11-M-Soz,
          103=Ali-Cem-11-H-TM,
          104=Ayse-Can-10-H-MF,
          105=Ayse-Cem-11-M-TM,
           106=Fatma-Han-10-K-Soz}
         */

        Set<Integer> ogrenciKeySet = ogrenciMap.keySet();
        //Bir mapteki keyleri set olarak dondurur

        System.out.println(ogrenciKeySet);

        //[101, 102, 103, 104, 105, 106]

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        //bir Mapteki valueleri bize dondurur
        System.out.println(ogrenciValueCollection);

        /*[Ali-Can-10-H-MF,
         Veli-Cem-11-M-Soz,
          Ali-Cem-11-H-TM,
          Ayse-Can-10-H-MF,
          Ayse-Cem-11-M-TM,
          Fatma-Han-10-K-Soz]
         */

        //Java da element arasina cizgi konmaz virgul konur o sekilde yazilir biz de virgul kullanabiliriz ancak
        // bu durumda value collectionunun kac elemanli olduguna dikkat etmemiz gerekir. virgulle ayrilmis cok fazla
        //element olabilir fakat value lerin bir butun olarak tek bir string oldugunu unutmamaliyiz.(yukardakinin her
        // elementin arasinda virgul var gibi dusunun ama collectionun size i derken herbirini saymayiz)

        System.out.println(ogrenciValueCollection.size());//6
    }
}
