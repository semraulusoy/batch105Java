package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        List<String>harfler=new ArrayList<>();

        //tum sesli harfleri listeye ekleyin
        //eklenecek tum elementleri tumden ekleyemem ama bir array olarak yazip forloopla listeye ekleyebiliriz.

        String [] arr={"a","e","i","o","u"};

        for (int i = 0; i < arr.length; i++) {

            harfler.add(arr[i]);

        }
        System.out.println(harfler);
        }
    }

