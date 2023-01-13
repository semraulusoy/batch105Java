package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        //Java collections icerisindeki bazi classlar index desteklemez.
        //bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz olur.

        //list<> index yapisini destekledigi icin boyle bir ohtoyac duymaz
        //ancak bu gunluk index kullanmadan list elemanlarina ulasmaya
        // ve onlari update etmeye calisalim.

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        //Index kullanmadan listin tum elementlerini yazdirin.eger index kullaniyor olsaydik normal for loop yeterliydi.
        //for each loop bunun icin uygundur.

        for (Integer each:sayilar
             ) {
            System.out.println(each+" ");}
            //indeks kullanmadan listin elementlerini 1 artirin
            //indeks kullanmadan 25 ten buyuk sayilari listten silin

            for (Integer each:sayilar
                 ) {
                System.out.println(each+1+" ");

            }
        System.out.println("");
        System.out.println(sayilar);//[10,20,30,40]

        for (Integer each :sayilar
             ) {
            each+=1;
            System.out.println(each+" ");

        }
        System.out.println("");
        System.out.println(sayilar);
        }
        }

//index kullanmadan listin elemanlarini kalici olarak degistirmek mumkun olmadi
//Java bunun icin Iterator Interface i olusturmustur.

