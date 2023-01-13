package ders22_arraysList;

import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {


        Integer[]arr={1,2,3};

        //verilen  bir arrayi list'e cevirmek icin  bir list olusturup forloop la elementleri tasiriz.
        // tavsiye edilen budur.

        List<Integer> arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);

        // bu yontemin iki negatif yonu vardir
        //1-bu sekilde olusturulan listler esnek uzunluga sahip degillerdir
        // w add,remove gibi ozellikleri kullanmak isterseniz rte
        //arraydenList.add(10);olmaz
        //arraydenList.remove(1);olmaz
        //arrayden cevirildigi icin array ozellikleri gosterir.
        //2- bu yonteme kaynak olan arrayle yeni olusturulan
        // listi birbine baglar birinde yaptiginiz degisikligi
        // otomatik olarak  digerine de yansitir.
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Liste : "+arraydenList);
        //sadece arrayin bir elemanini degistirelim
        arr[0]=10;
        System.out.println("Array'i degistirince Array: "+ Arrays.toString(arr));
        System.out.println("Array'i degistirince Liste : "+arraydenList);
    }
}
