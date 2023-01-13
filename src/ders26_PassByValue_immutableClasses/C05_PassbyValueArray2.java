package ders26_PassByValue_immutableClasses;

import java.util.Arrays;

public class C05_PassbyValueArray2 {
    public static void main(String[] args) {


        //bir method olusturun
        //sayilar arrayinin uzunlugundan 2 fazla olan
        //ve elementlerin tamami 5 olan yeni bir array olusturup
        //deger olarak sayilar arrayine atayin


        int[]sayilar={3,4,5,6};
        arrayeYeniDegerAtama(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }

    public static void arrayeYeniDegerAtama(int[]sayilar){

        int[]yeniArray=new int[sayilar.length+2];

        for (int i = 0; i <yeniArray.length ; i++) {
            yeniArray[i]=5;

        }
        sayilar=yeniArray;
        System.out.println("methodda sayilarin son hali"+ Arrays.toString(sayilar));
    }
}
//Java her sekilde passbyValue kullanilir
// list ve array gibi birden fazla element iceren objelerde objeyi degistiremezsiniz
// elementleri degistirdigimizde objenin referansi degismedigi icin elementlerin degisikligi kalici olur