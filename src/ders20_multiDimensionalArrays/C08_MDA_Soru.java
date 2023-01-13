package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDA_Soru {
    public static void main(String[] args) {


        //verilen iki katli arrayde her bir ic arraydeki elementleri toplayip
        // yeni olusturacaginiz tek katli bir arrae bu toplalari atayin
        //input:  int [][]arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}
        //output:     [10,3,12,12,9]


        int [][]arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int[]output=new int[arr.length];
        int innerArrayToplami=0;

        for (int i = 0; i < arr.length; i++) {//outer array icindeki inner arrrayi kontrol eder
            innerArrayToplami=0;

            for (int j = 0; j < arr[i].length ; j++) {//herbir inner arraydeki elemnetleri kontroleder.

                innerArrayToplami+=arr[i][j];


            }
        output[i]=innerArrayToplami;

            }
        System.out.println(Arrays.toString(output));
        }

}
