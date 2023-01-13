package ders20_multiDimensionalArrays;

import java.util.*;

public class C09_ArrayList {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);

        //List primitive data turu kabul etmez
        //List<Integer> sayilar=new List<>();
        //List bir interface oldugu icin direk obje olusturulamaz onun yerine sag tarafa array list yazariz.
    }}

/* ArrayList dinamik ve yeniden boyutlandirilabilir bir arraydir.
siz bir listi olusturdugunuzda 0 uzunlugunda olusturup istediginiz kadar ekleyebilirsiniz
 ama array alt yapisini kullandigi icin arrayin uzunlugu degistirilemedigi icin ayni mantikla calisir
 elementleri tek tek ekleyebiliriz.ilk olusturmasi sikintili olsa da kullanimi daha kolaydir.
 arrayin dezavantaji uzunlugu en basta belirtmek zorunda olamiz ve uzunllugun sabir olmasidir.
 sabit uzunluk esnek calismaya imkan tanimadigindanarray liste tutmakta cok kullanilmaz

 array lis array alt yapisini kullanmakla beraber element ekleme ve silme islemlerine aciktir. ancak array altyapisini
 kullandigi icin eklemeleri birer birer yapabiliriz.(veya uzunlugu belirli baska bir array list ekleriz)


list<Integer>sayilar=new ArrayList<>();
sayilar.add(10);
sayilar.add(20);
sayilar.add(30);

System.out.println(sayilar);


LISTIN BOYUTUNU BELIRLEME
list.size() methodu Listin boyutunu bize dondurur.

sout.(sayilar.size())

*/

