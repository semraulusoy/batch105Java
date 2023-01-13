package ders45_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {


        //Verilen bir cumlede kullanilan herbir harfi
        //ve o harfin kullanim miktarini
        //A=5,b=3...gibi yazdirin
        String str = "Javayi balonu patlamadan bitirelim";
        String[] harflerArr = str.split("");

        Map<String, Integer> kullanimMiktarlariMap = new TreeMap<>();
        int sayac=1;
        //1-Tum harfleri sirasi ile ele alacagiz

        for (int i = 0; i < harflerArr.length; i++) {



            //2 - ele aldigimiz harfin daha once mape eklenip eklenmedigini kontrol edelim
           if (kullanimMiktarlariMap.containsKey( harflerArr[i])){
               continue;//iceriyorsa devam et demek


           }else {
               //kod buraya geldiyse o harf henuz mape eklenmemistir
               //o zaman bu harfin kullanim miktarini bulmaliyiz
               for (int j = i+1; j < harflerArr.length ; j++) {
                   if (harflerArr[j].equals(harflerArr[i])){
                       sayac++;
                   }}
//sayma islemi bitti ve value'yu mape ekleyelim
                   kullanimMiktarlariMap.put(harflerArr[i],sayac);
                   sayac=1;
               }

           }
            System.out.println(kullanimMiktarlariMap);
        }
    }

