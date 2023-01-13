package ders19_arrays;

import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElemetleriToplama;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {


        //verilen bir arrayin elementlerini 2 artirin

        int[]arr={2,3,4};

        C03_ArrayElementleriniArtirma.elementleri2artir(arr);

        System.out.println(Arrays.toString(arr));

        //arrayin elementlerini topla

        C04_ArrayElemetleriToplama.pozitifElementleriTopla(arr);

        //arr arrayinde 10 element olarak var mi

        C05_ArraydeElemanArama.elemanAra(arr,10);


        //kullanicidan deger alarak bir array olusturun

        int yeniArr[]=C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));
    }
}
//Arrays.sort() methodu arrayi NATURAL ORDER a gore siralar
// bu sadece sayilari kucuktan buyuge siralamak degil harf karakterleri de kapsar.
//buyukten kucuge siralamak isterseniz sort() ile siralayip loop ile tersine cevirmeniz gerekir.