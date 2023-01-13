package ders18_arrays;

public class C04_ArrayElemetleriToplama {
    public static void main(String[] args) {

        //verilen bor arraydeki pozitif tam sayilari toplayip sonucu
        // bize donduren bir method yaziniz


        int[] arr = {3, -3, 5, -7, -6, 1, -2}; //3+5+1=9


        System.out.println(pozitifElementleriTopla(arr));

    }




    public static int pozitifElementleriTopla(int[]arr){


        int toplam=0;

        for(int i=0;i<arr.length;i++){

        if(arr[i]>0){

        toplam+=arr[i];
        }
        }
        return toplam;
        }
        }