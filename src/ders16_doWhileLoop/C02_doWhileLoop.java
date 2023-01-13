package ders16_doWhileLoop;

public class C02_doWhileLoop {
    public static void main(String[] args) {


//10,11,12 sayilarini toplayan bir whileloop olusturalim

        int sayi=10;
        int toplam=0;


        do {
            toplam=toplam+sayi;
            sayi++;

        }while(sayi<=12);

        //doWhileLoopun 2 avantaji vardir
        //1-loop bodysi en az bir kere calisir
        // while loop da baslangic degeri uygun degilse loop bodysi hic calismaya bilir.
        //2-while bitis kontrolu loop kadar calisir.
        //while loop da bir kere fazla calisirdi.





    }
}
