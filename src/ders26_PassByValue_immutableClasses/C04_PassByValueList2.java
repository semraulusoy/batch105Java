package ders26_PassByValue_immutableClasses;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {
    public static void main(String[] args) {

//bir method olusturalim
// methodda yeni bir liste olusturalim
// listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin
// sonra sayilar Listesine deger olarak yeni listi atayin
// ve sayilar listini yazdirin

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);

        yeniListDegeriAta(sayilar);
        System.out.println("Method calldan sonra main methoddan sayilar list"+sayilar);

    }
    //bir method olusturun
    public static void yeniListDegeriAta(List<Integer> sayilar){
        //methodda yeni bir liste olusturun

        List<Integer> yeniList=new ArrayList<>();

        //Listeye sayilar listesindeki degerlerin 5 fazlasini element olarak atayin

        for (int i = 0; i <sayilar.size() ; i++) {
            yeniList.add(sayilar.get(i)+5);}

            //sonra sayilar Listesine deger olarak yeni bir list atayin listenin tamammina yeni deger atadik.
        sayilar=yeniList;

        //ve sayilar Listesini yazdirin

            System.out.println("Method'da sayilar listesinin son hali : " + sayilar );



            }
        }









