package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {



        int [][] arr2={{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};
        System.out.println(arr2.length);//5
        System.out.println(arr2[2].length);//3
        //System.out.println(arr2[1]);==>yazdirmaz
        System.out.println(Arrays.toString(arr2[1]));//[1,2]

//Multidimensional arrayler icerisinde array bulunduran arraylerdir.

        int [][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //bu sekilde deklare edilmis olan arr arrayini tek katli yazmak istersek lengthi 5 olan array goruruz.

      //  int [] arr ={arr[0],arr[1],arr[2],arr[3],arr[4]};

        //MDA LERDE BIR ELEMENTE ULASMAK ICIN ONCE ELEMENTIN ICINDE OLDUGU INNER ARRAYE
        // SONRA O INNER ARRAYDEKI INDEXI KULLANARAK DA ELEMENTE ULASMALIYIZ.

        int [][] arr1={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        //ornegin 5 elementine ulasmak icin once outer arrayden inner arraye sonra inner arrayden 5 elementine ulasalim
        //arr[2][2] yazilir.

        //arrayin icerisindeki bir elementi yazdirmak istersek

        System.out.println(arr[1][1]);//2

        //inner arraylerden birini yazdirmak istersek Arrays.toString() kullaniriz

        System.out.println(Arrays.toString(arr[1]));//[1,2]

        //eger tum arrayi yazdirmak istersek Arrays.deepToString()kullaniriz.

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]

//bu iki katli bir arraydir.bir outer dis array birde icte inner arrayler vardir.
// ihityac olursa onun icinde de innerlar olur.cok kullanilmaz.
    }
}
