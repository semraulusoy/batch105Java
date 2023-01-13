package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        String str1="Ali topu at, at Ali at";
        String[]arrvirgul= str1.split(",");
        System.out.println(Arrays.toString(arrvirgul));
        //[Ali topu at,  at Ali at]

        String[]arrSpace=str1.split(" ");
        System.out.println(Arrays.toString(arrSpace));
        //[Ali, topu, at,, at, Ali, at]

        String[]arrHiclik=str1.split("");
        System.out.println(Arrays.toString(arrHiclik));
        //[A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]





        String str="eJava gercekten cok cok guzel";

        //verilen stringde kac tane e harfi oldugunu bulunuz.

        String[] eArrayi=str.split("e");
        System.out.println(Arrays.toString(eArrayi));//[, Java g, rc, kt, n cok cok guz, l]

        System.out.println(eArrayi.length);//5

        System.out.println("metindeki e sayisi: "+(eArrayi.length-1));//4


        //**********2.yontem
       //Stringi hiclik ile split yaparak karakterlerine ayiralim


        String[] tumkarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumkarakterlerArr));

        //[J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
       // bir Loop ile tum karakterleri kontrol et


        for (int i = 0; i <tumkarakterlerArr.length ; i++) {
            if (tumkarakterlerArr[i].equals("e")){
                sayac++;

        }
            System.out.println("Metindeki e sayisi"+sayac);



    }
}}
