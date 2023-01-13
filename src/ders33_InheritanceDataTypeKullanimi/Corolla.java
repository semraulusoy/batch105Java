package ders33_InheritanceDataTypeKullanimi;

public class Corolla extends BToyota{
   String model="Corolla";
    String uretimyeri ="Turkiye";
  int yil =2023;

    public static void main(String[] args) {
         Corolla corolla1=new Corolla();
        System.out.println(corolla1.yil);//2023
        //corolla classi
        System.out.println(corolla1.model);//Corolla
        //corolla classi
        System.out.println(corolla1.uretimyeri);//Turkiye
        //corolla classi
        System.out.println(corolla1.motor);//"tum araclaclar motor kullanir"
        //Araba classi
        System.out.println(corolla1.plaka);//"Tum araclarin plakasi vardir"
        //Araba classi
        System.out.println(corolla1.yakit);//"Toyota cevreci yakit kullanilir
        //BToyota classi
        System.out.println(corolla1.marka);//"Tum araclarin markasi vardir"
        //BToyota classi

        //bir obje olusturulurken data turu ve constructor ayni classdan ise bir variablein degerini bulmak icin o classa gideriz o classda
        // yoksa sirasiyla parent classlara bakilir ilk bulunan kullanilir.


        BToyota corolla2=new Corolla();
        /* Obje olusturulurken data turu ve constructor farkli ise variablein degerini bulmak icin
        data turu olan classa gidilir varsa kullanilir yoksa o classin parentlarina bakilir
        bulunamazsa CTE verir ama geri vites yapmaz yani child clasa bakmaz
         */
        System.out.println(corolla2.yil);//1990
        //BToyota classi
        System.out.println(corolla2.model);//"Binek araclarin modeli olur
        //BToyota classi
        //System.out.println(corolla2.uretimyeri);//CTE

        System.out.println(corolla2.motor);//"tum araclaclar motor kullanir"
        //Araba classi
        System.out.println(corolla2.plaka);//"Tum araclarin plakasi vardir"
        //Araba classi
        System.out.println(corolla2.yakit);//"Toyota cevreci yakit kullanilir
        //BToyota classi
        System.out.println(corolla2.marka);//"Tum araclarin markasi vardir"
        //BToyota classi


        Araba corolla3=new Corolla();

        //System.out.println(corolla3.yil);//CTE

       // System.out.println(corolla3.model);//CTE

       // System.out.println(corolla3.uretimyeri);//CTE

        System.out.println(corolla3.motor);//"tum araclaclar motor kullanir"
        //Araba classi
        System.out.println(corolla3.plaka);//"Tum araclarin plakasi vardir"
        //Araba classi
        System.out.println(corolla3.yakit);//"Araclar farkli yakit kullanir"
        //Araba  classi
        //System.out.println(corolla3.marka);//CTE


        BToyota toyota1=new BToyota();
        System.out.println(toyota1.marka);//BToyota
        System.out.println(toyota1.model);//BToyota
        System.out.println(toyota1.motor);//Araba
        System.out.println(toyota1.plaka);//Araba
        System.out.println(toyota1.yil);//BToyota
        System.out.println(toyota1.yakit);//BToyota


        Araba toyota2=new BToyota();

        //System.out.println(toyota2.marka);//CTE
        //System.out.println(toyota2.model);//CTE
        System.out.println(toyota2.motor);//Araba
        System.out.println(toyota2.plaka);//Araba
        //System.out.println(toyota2.yil);//CTE
        System.out.println(toyota2.yakit);//Araba

        Araba araba=new Araba();
        System.out.println(araba.motor);//Araba
        System.out.println(araba.plaka);//Araba
        System.out.println(araba.yakit);//Araba


    }
}
//hangi data turunu sectiysek o classtaki variablelara sahip olur.