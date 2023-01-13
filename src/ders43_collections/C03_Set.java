package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {


        //verilen bir arrayin tekrar eden elementlerini silip
        //her elementin sadece bir kere kullanildigi hale getirin

        int[]arr={1,4,5,6,7,8,4,3,2,6,5,4,9,8,0,};
        Set<Integer> geciciSet=new HashSet<>();
        for (Integer each:arr
             ) {
            geciciSet.add(each);

        }

        arr=new int[geciciSet.size()];
        //setteki benzersiz hale getirilen elementleri aecici arraye tasiyalim.Arrayde index kullanmak zorundayiz.
        // o yuzden fori olmaz

        int index=0;
        for (Integer each:geciciSet){
       arr[index]=each;
        index++;



    }
        //tekrarsiz degerleri gecici arraye tasidik simdi kendi arrayimize bu gecici degerleri atayalim

        System.out.println(Arrays.toString(arr));

}}
///elimizdeki arrayindeki elemanlari  bir sete attik .her elemandan birer tane alan
// set olusturduk bizim arrayde 20 eleman vardi yeni bos bir array olusturdum arrayi yeni haline uygun uzunluga getirdik