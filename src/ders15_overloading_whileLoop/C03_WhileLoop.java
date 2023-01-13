package ders15_overloading_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {


        //iki basamakli sayilari aralarinda bir bosluk olacak sekilde yan yana yazdirin

        for (int i = 10; i <=99; i++) {
            System.out.print(i+" ");


        //bunu while (iken)Loopla yapacak olursak ilk baslangic sarti herhangi bir variable olurturarak deger atayabiliriz


       // int a=10;
        //while(a<100)  {
            //System.out.print(a+" ");//bu sekilde yazarsak sonsuz loop olur a degeri devamli doner doner 10 yazdirir
            // artis yada azalma yazmak lazim

        int a=10;
        while(a<100){
            System.out.print(a+" ");
            a++;

        }

        }







        //for loop belirli sayida calistirilmasi gereken bir
        // donguyu verimli sekilde yazmamiza olanak saglayan bir tekrar kontrol yapisidir
        // for Loop kullanirken ihtiyacimiz olan;
        // 1-baslangic degeri
        // 2-bitis sarti(condition)
        // 2-artis azalis yontemi
        // bilgilerine while loop icin de ihtiyac duyariz
        // ama java bunlari otomatik yazmadigi icin manuel yazmamiz gerekir.

       // for (int i = 0; i < 100; i++) {

        //int s=10
        //while (s<100){calisacak kodlar s
        // s++;
        //baslangic degerini ve artis degerinin manuel yazilmasi while loopun baslangicta kullanissiz gibi gosterebilir
        //ozellikle artis ve azalis miktarlari yazilmazsa kod sonsuz loop a gidecek ve bize sorun cikaracaktir.




        }







    }

