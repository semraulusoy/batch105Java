package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        //soru: verilen String bir Arraydeki her bir elementi kontrol edip
        //_kelimenin uzunlugu cift sayi ise ilk yarisini
        //_kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin
        String[] arr = {"Sumeyra", "Mehmet", "Ekrem", "Yilmaz", "Ayse"};

        List<String> yeniList = new ArrayList<>();

        for (String each : arr
        ) {
            if (each.length() % 2 == 0) {
                yeniList.add(each.substring(0,each.length()/2));

        } else { //uzunlugu tek

                yeniList.add(each.substring(each.length()-1/2));
        }

    }
        System.out.println(yeniList);
}}