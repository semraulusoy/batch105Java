package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_Listliterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        ListIterator lit= sayilar.listIterator();
        //Iterator kullanarak Listenin elementlerini sondan basa dogru yazdirin
        //once iteratoru sona goturelim
        while (lit.hasNext()){
            lit.next();
        }
        //simdi sondan basa dogru gidelim giderken elementleri yazdiralim.

        while (lit.hasPrevious()){

            System.out.println(" " + lit.previous());

        }

        //Iterator kullanarak listenin tum elemenlerini 5 artirin.

        //iteratoru nerde biraktigimizi anlamak icin
        System.out.println("");
        System.out.println(lit.nextIndex());
       //  hangi indeksin oncesinde oldugumuzu soyler.

        while (lit.hasNext()){
            //lit.next();//sayiyi indirir yani getirir

            lit.set((Integer)lit.next()+5);}
            System.out.println(sayilar);

        //Iterator kullanarak 40 dan kucuk olan elementleri silin

        while(lit.hasPrevious()){if ((Integer)lit.previous()<40){
            lit.remove();
            }

        }
        System.out.println(sayilar);
    }
}
