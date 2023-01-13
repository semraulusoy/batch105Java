package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String>dq1=new LinkedList<>();
        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");
        System.out.println(dq1);//[A, K, B, F]
        System.out.println(dq1.getFirst());//A
        System.out.println(dq1.getLast());//F
        System.out.println(dq1.remove());//A
        System.out.println(dq1.poll());//K
        System.out.println(dq1.removeLast());//F
        System.out.println(dq1.remove());//B artik listemiz bos
        //System.out.println(dq1.remove());NoSuchElementException
        System.out.println(dq1.poll());//null
        //bos deque olmasina ragmen poll exception firlatmaz,bize eleman silemadigi icin null gonderir.


        dq1.add("K");
        dq1.add("B");//[K,B]
        dq1.push("F");//[F,K,B]deque in basina eleman ekler eger deque ile
                         // ilgili sinizlandirma varsa ve yer kalmamissa IllegalStateException verir

        System.out.println(dq1.pop());//ilk elementi siler ve bize getirirremoveFirst ile ayni islevi gorur


        System.out.println(dq1.element());//K
        //en bastakini getirir ama silmez.peek ten farki bos olursa exception getirir.
        System.out.println(dq1.peek());//K bos deque de calisirsa null dondurur

        System.out.println(dq1.peekFirst());//K
        System.out.println(dq1.peekLast());//B
        System.out.println(dq1.offer("C"));//true
        //elementi kuyrugun sonuna ekler eger yeri varsa true kapasitesiniri varsa false dondurur liste [K,B,C]
        System.out.println(dq1.offerFirst("M"));//true===>[M,K,B,C]

        System.out.println(dq1);


    }
}
