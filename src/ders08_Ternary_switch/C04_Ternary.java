package ders08_Ternary_switch;

public class C04_Ternary {
    public static void main(String[] args) {



        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        int kenar1=10;
        int kenar2=12;
        int kenar3=10;

        System.out.println(kenar1==kenar2&&kenar2==kenar3?"Eskenar ucgen":"eskenar ucgen degil");


        // butun uzunluklari 0 alirsak gene eskenar ucgen yazar
        // oysa ucgenin kenar uzunlugu 0 yada - olmaz b
        // urada is komplekslestigi icin ternary kullanmak uygun olmaz.uzun karisik bir kodlama olur

        /*int kenar1=0;
        int kenar2=0;
        int kenar3=0;*/


        System.out.println(kenar1>0&&kenar2>0&&kenar3>0&&kenar1==kenar2&&kenar2==kenar3
                ?"Eskenar ucgen":"eskenar ucgen degil");



        //kullanicidan iki sayi alin buyuk olmayan sayiyi  yazdirin


        int sayi1=10;
        int sayi2=11;
        System.out.println(sayi1>sayi2?sayi2:sayi1);

        // iki sayiyi ayni alirsak ikisini de yazdirir
        // buyuk onemi yoktur buyuk olmayan denmistir esit denmemistir

        int a= 10;
        System.out.println(a>0?"sayi pozitif":"sayi pozitif degil");
        System.out.println(a>20? a*a:a++);
        System.out.println(a<100||a<0?3*a+1:2+a/5);

//a++ degeri post increment oldugu icin 10 olur once atar sonra deger veririz
// ama alt satira gecerken 11 olarak gecer

        int x=10;
        int y=15;
        int z=a>0?y++:--x;
        System.out.println(x+","+y+","+z);

    }

}
