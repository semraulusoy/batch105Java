package ders18_arrays;

public class C05_ArraydeElemanArama {
    public static void main(String[] args) {


        //verilen bir arrayde verilen bir elemanin
        // var olup olmadigini ve varsa kac kere kullanildigini
        // yazdiran bir method olusturun

        //kac tane diyorsa sayac yada count kullanilir
        int []arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman=2;
        elemanAra(arr,arananEleman);//


    }

    public static void elemanAra(int[]arr,int arananEleman){

       int sayac=0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]==arananEleman) {
                sayac++;
            }}
        if(sayac==0)
            System.out.println("aranan sayi Array de yok");
        else{
            System.out.println("aranan "+arananEleman+" sayi array'de "+sayac+" kere kullanilmistir.");
            }

        }


    }

