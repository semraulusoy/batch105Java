package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String []arr={"ali","ulus","nesrin"};

       // elementleri yazdirmakla arrayi yazdirmak ayni degildir .arraydeki elementleri forloopla yazdirabiliriz.
        //yukardaki arrayin tum elementlerini aralarinda birer bosluk birakarak yazdiralim .


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

            // bu arrayi array olarak yazdiralim

            System.out.print(arr);

            //array bir oble non primitive data oldugundan java referansini yazdirir
            //arrayi array olarak yazdirmak isterseniz arrays classindan  yardim almalisiniz


            System.out.println(Arrays.toString(arr));



        }



    }
}
