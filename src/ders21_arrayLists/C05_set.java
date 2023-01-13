package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {


        int []arr={1,2,4,3,5,2,5,1,2,4,5,3,4,5};


        List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {

            sayilar.add(arr[i]);}

            //Java'da set() methodu update icin kullanilir.
            //add() methodu farklidir sadece istenen elementi istedigimiz yere ekler
        // digerlerine dokunmaz kaynak yapae element silmez
            //set() methodunda olan element degidtirilir.silinir yenisi eklenir.

            sayilar.set(0,8);
            System.out.println(sayilar);
            }
    }

