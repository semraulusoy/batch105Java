package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {

        //verilen bir int arrayde en buyuk ve en kucuk sayilari yazdiran bir method olusturun

      int[] arr={3,8,1,5,2,9} ;
      enBuyukEnKucukElementYazdir(arr);
    }

    public static void enBuyukEnKucukElementYazdir(int[]arr){
        Arrays.sort(arr);
        System.out.println("en buyuk element:"+arr[arr.length-1]);
        System.out.println("en kucuk element:"+arr[0]);
    }
}



        // bir arrays de siralama yapmak icin arrays classdan yardim almak gerekir .
        //Arrays.sort(arr)  kullanilir

