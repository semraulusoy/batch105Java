package ders18_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniArtirma {
    public static void main(String[] args) {


        //verilen bir int arrayin tum elemanlarini 2 artirip bize donduren bir method olusturun.
        //eski arrayi yeni haliyle kaydedin.

        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;

        }
        System.out.println(Arrays.toString(arr)); //[4,6,8,10]

        arr = elementleri2artir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] elementleri2artir(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;



        }

return arr;
    }
}