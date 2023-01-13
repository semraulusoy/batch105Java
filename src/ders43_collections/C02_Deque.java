package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String>urunler=new LinkedList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");

        //Tum urunlerin basina "Y"ekleyelim
        String eleman="";
        Deque geciciDeque=new LinkedList();

        while (eleman!=null){
            eleman=urunler.poll();//poll methodu ilk elementi silip getirir deque de element kalmadiysa null gonderir
            //deque de eleman olana kadar bu islemi devam ettiricez null gelince while dongusu bitecek
            if (eleman!=null){
               // ilk elemanim null olabilir diye konttrol ederiz
                eleman="Y"+eleman;

            geciciDeque.add(eleman);

        }
    }
        urunler=geciciDeque;
        System.out.println(urunler);
}}
