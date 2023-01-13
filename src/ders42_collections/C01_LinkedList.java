package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {


        LinkedList<String>ll1=new LinkedList<>();
        //LinkedList 3 tane interface i implement etmistir
        //List,Queue,deque interfaceleri
        //dolayisiyla bu interfacelerden sonra gelen ilk concrate class oldugundan
        //bu 3 interface deki tum abstract methodlari override etmistir
        //LinkedList olusturulurken secilen data turune gore
        //bu 3 interfaceden birinin ozelliklerini alabilir.
        //veya data turu LinkedList secilirse 3 interfacein ozelliklerini de toptan alir.

        List<String> ll2=new LinkedList<>();
        ll1.add("K");
        ll1.add("T");
        //Daha onceden arrayList olusturuken List<>interfaceini data turu olarak kullandigimizdan
        //bu sekilde olusturularn LinkedListlerin ozelliklerini biliyoruz.
        ll2.add("R");//[R]
        ll2.add("Z");//[R,Z]
        ll2.add(0,"A");//[A,R,Z]
        ll2.addAll(2,ll1);//[A, R, K, T, Z]

        ll2.set(3,"M");//[A, R, K, M, Z]
        ll2.add("K");
        ll2.add("T");
        System.out.println(ll2.get(1));//R
        System.out.println(ll2);
        System.out.println(ll2.retainAll(ll1));//true
        System.out.println(ll2);//[K,K,T] linklist1 de olanlari tuttu kalanlari sildi retainall
        System.out.println(ll2.hashCode());//104275
        ll2.add("A");
        System.out.println(ll2.hashCode());//3232590
        //System.out.println(ll2.get(4));//exception
        System.out.println(ll2.subList(2, 4));//[T, A]//2 dahil 4 dahil olmadigindan exception firlatmaz

    }
}
