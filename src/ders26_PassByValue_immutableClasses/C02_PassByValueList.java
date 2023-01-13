package ders26_PassByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList {
    public static void main(String[] args) {

        //bir method olustiralim ve methodda listdeki sayilari 5 artiralim ve methodda listenin son halini yazdiralim


        List<Integer>sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        elementleri5Artir(sayilar);
        //meyhod call sonrasi main method icinde Listi tekar yazdiralim
        System.out.println(sayilar);



    }
    public static void elementleri5Artir(List<Integer>sayilar){
        for (int i = 0; i < sayilar.size() ; i++) {
            sayilar.set(i,sayilar.get(i)+5);


        }
        System.out.println(sayilar);
    }
}
