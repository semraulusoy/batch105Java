package ders20_multiDimensionalArrays;

public class C02_MDA_ElementleriToplama {
    public static void main(String[] args) {

        int[][]arr={{1,2},{3,4,5},{7}};

        //elementleri toplayalim
        int toplam = 0;
          
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {

                toplam+=arr[i][j];
            }
        }

        System.out.println("2 katli Arrayin elementleri toplami:" +toplam);
    }
}
