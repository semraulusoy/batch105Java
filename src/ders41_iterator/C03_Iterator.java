package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        //Iterator kullanarak Bu Listeden 15 ile 35 arasindaki sayilari silin

        Iterator it1=sayilar.iterator();
        Integer element;
       while (it1.hasNext()){
           element=(Integer) it1.next();
           if (element>15&&element<35)
      it1.remove();}
        System.out.println(sayilar);
       sayilar.add(20);
       sayilar.add(30);
        System.out.println(sayilar);
//tum elementleri iterator yardimiyla silelim

        Iterator it2=sayilar.iterator();
        //silmek icin once o objeye gitmen lazim
        it2.next();
        it2.remove();
        System.out.println(sayilar);

        //sonraki sayiyi silmek icin yandaki elemente gitmek lazim
        it2.next();
        it2.remove();
        //her hareket ettiginde uzerine bir eleman alir.
        System.out.println(sayilar);

        while (it2.hasNext()){
            it2.next();
            it2.remove();
        }

        System.out.println(sayilar);
        }

    }


