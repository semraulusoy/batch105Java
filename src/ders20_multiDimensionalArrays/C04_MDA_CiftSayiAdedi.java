package ders20_multiDimensionalArrays;

public class  C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {


        //verilen iki katli integer arraydeki cift sayi adedini bulan bir kod yazin

        int[][] arr={{4,6},{3,5,8},{1,0,4}};
           int count=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

                    System.out.println("Arraydeki ciftsayi adedi"+ count);
                }


            }


