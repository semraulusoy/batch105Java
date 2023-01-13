package ders19_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
         //Arrayde istenen elemanin varligini kontrol etmek icin binarySearch()methodu kullanilir.

        int[]arr={1,8,9,3,7,2,5,8,1};
        System.out.println(Arrays.binarySearch(arr,8));//7
        System.out.println(Arrays.binarySearch(arr,5));//-2
        System.out.println(Arrays.binarySearch(arr,1));//0
        System.out.println(Arrays.binarySearch(arr,9));//-10

        /* Binary search metodunun dogru sonuclar verebilmesi icin oncelikle sort metodu kullanilmalidir.
        ****sort kullanmadan binary search ile yapilan aramanin sonucu belli olmaz dogru sonucta verebilir
        * yanlis sonuc da
         */


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,8));//6
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,1));//1
        System.out.println(Arrays.binarySearch(arr,9));//8

        //array de olmayan bir eleman aratirsak


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,-3));//-1
        System.out.println(Arrays.binarySearch(arr,4));//-5
        System.out.println(Arrays.binarySearch(arr,10));//-10
        System.out.println(Arrays.binarySearch(arr,100));//-10


    }
}
