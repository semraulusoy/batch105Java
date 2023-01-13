package ders12_forLoops;

public class C05_DikkatEdilecekler {


    public static void main(String[] args) {


       /* for (int i = 0; i >-10 ; ++) {
          System.out.println(i+" ");

     }
     sonsuz loop denir.
        */
        // for (int i = 0; i > 10; i++) {
        // System.out.println(i);
        /* ilk deger icin bitis sarti true olmuyorsa for bodysi hic devreye girmez.


         */

        //bir loopun sonunu beklemeden bitirmek istersek
        //kullanicini verdigi bir sayinin asal olup olmadigini bulun

/*
            int sayi= 103;
            int bayrak=0; //asal mi true


            for (int j = 2; j <= sayi- 1; j++) {

              //  if (sayi %i==0) {

                    bayrak++;
                    break;


                    // bir deger bulmamiz yeterli hepsine bakmaya gerek yok.

                }
            }
          //  System.out.println(bayrak);

            if (bayrak==0){
                System.out.println("asal sayi");
            }else{
                System.out.println("asal sayi degil");

            }


        }

*/
// kullanicini verdigi bir sayinin asal olup olmadigini bulun


        int sayi = 83;

        int bayrak = 0;

        for (int i = 2; i < sayi - 1; i++) {
            if (sayi % i == 0) {
                bayrak++;
                break;
            }

        }
        System.out.println(bayrak);
        if (bayrak == 0) {
            System.out.println("asal sayi");

        } else {
            System.out.println("asal sayi degil");
        }
    }


 }