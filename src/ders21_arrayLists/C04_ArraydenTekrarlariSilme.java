package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arraydeki tekrar eden sayilari
        // bir kere olacak sekilde arrayi duzenleyin.


        int []arr={1,2,4,3,5,2,5,1,2,4,5,3,4,5};
        //bu soruyu bir arrayde cozmek cok zordur
        //bunun yerine bu arrayin elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir liste alalim
        //en son o listteki elementleri iceren bir arrray olusturup
        //yeni arrayi eski arraye deger olarak atayalim

        List<Integer>tekrarsizliste=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!tekrarsizliste.contains(arr[i])) {
                tekrarsizliste.add(arr[i]);
            }
        }

            System.out.println(tekrarsizliste);


        //EN SON O LISTTEKI ELEMENTLERI ICEREN BIR ARRAY OLUSTURUP
        //yeni arrayi eski arraye deger olarak atayalim.

        arr=new int[tekrarsizliste.size()];//[0,0,0,0,0]
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizliste.get(i);}

            System.out.println("Arrayin tekrarsiz hali : "+ (Arrays.toString(arr)));

        }
        }






