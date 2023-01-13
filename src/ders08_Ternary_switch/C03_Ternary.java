package ders08_Ternary_switch;

public class C03_Ternary {
    public static void main(String[] args) {



       /*
        ternary operatoru tek basina kullanilamaz.
        ternary bize bir sonuc uretir bu sonucu ya direk yazdirmali veya bir variable a atamaliyiz

        a%2==0) ?"cift sayi":"tek sayi" kabul etmez

        ternary nin sonucunu bir variable a atayacaksak
        true ve false durumlarinda uretilecek sonucun ayni data turune uygun olmasi gerekir
        aksi halde CTE olusur.



        */

        int a= 5;

String sonuc =a%2==0?"cift sayi":"tek sayi";
        System.out.println(sonuc);


String sonuc2= a>10?"buyuk sayi":""+2*a;
//CTE  vermemesi icin Stringe  cevirdik.


        System.out.println(a>10?"buyuk sayi": 2*a);
    }
}
//ternary sadece deger dondurdugu icin ya yazdirmali veya bir variable a atamalisiniz.