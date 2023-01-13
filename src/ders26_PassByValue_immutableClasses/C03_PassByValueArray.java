package ders26_PassByValue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {
    public static void main(String[] args) {

        //Verilen bir arrayde elementlerini 5 artirip sonra yazdiran bir method olusturun
        //Java pass by Value dur
        int[]arr={3,4,5};
        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);
        System.out.println("method calldan sonra main method icinde arr: " +Arrays.toString(arr));
        //arrayin kendisine deger atanmadi elementlere deger atandi yolcularin degismesi arabayi degistirmez.

    }
    public static void elementleri5Artir(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));
    }

}
