package ders35_Exceptions;

public class C02_ArithmeticException {
    public static void main(String[] args) {


        //verilen iki sayiyi birbirine bolup sonucun tam sayi kismini yazdirin


        int sayi1=20;
        int sayi2=0;
        try {
            //try body si riskli oldugunu ongordugumuz kodlar
            System.out.println(sayi1/sayi2);
            System.out.println("Bakalaim bu satir calisacak mi ?");
        } catch (Exception e) {
            //catch(EXCEPTION E) ONGORDUGUMUZ RISK
            System.out.println("sayi 0'a bolunemez");

            //catch den sinraki {} catch blogu denir beklenen risk gerceklesirse calisacak kodlar
            //acikirsan buzdolabina bak gibi

        }

        //bazi exception'lar if else ile handle edilebilir
        // ancak tum exception'lar icin if else yeterli olmaz.
    }
}
