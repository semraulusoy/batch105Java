package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {


        //verilen iki katli bir arrayde ayni indexe sahip elementleri toplayip
        // yeni olusturacagimiz bir arraye bu toplamlari atayin.
        //input: int [][]arr={{3,4,5},{2,3,6,7}};
        //output: [5,7,11}

        // inner 2 array olacagini ama bunlarin uzunluklarinin degisebilecegini kabul ettik.
        // toplarken en kisanin uzunlugu baz alinir.



        int [][]arr={{3,4,5},{2,3,6,7}};

        int ortakIndexSayisi=arr[0].length<arr[1].length?arr[0].length:arr[1].length;

        System.out.println(ortakIndexSayisi);

        int [] ortakindexToplamlariArr=new int[ortakIndexSayisi];

        for (int i = 0; i < ortakindexToplamlariArr.length; i++) {
            ortakindexToplamlariArr[i]=arr[0][i]+arr[1][i];
            System.out.println(Arrays.toString(ortakindexToplamlariArr));

        }


    }
}
