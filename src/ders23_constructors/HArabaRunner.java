package ders23_constructors;

public class HArabaRunner {
    public static void main(String[] args) {
         HAraba arb1= new HAraba();


         arb1.marka="Toyota";
         arb1.model="Corolla";
         arb1.yakit="Dizel";
         arb1.yil=2010;
         arb1.fiyat=12000;

        System.out.println(arb1);

        HAraba arb2=new HAraba("Honda","Civic","Benzin",2011,11000);
        System.out.println(arb2);

        HAraba arb3=new HAraba("opel","Corsa","Dizel",2013,10000);
        System.out.println(arb3);

        HAraba arb4=new HAraba("Tesla","X",2020);
        System.out.println(arb4);


    }

}//bu yazdiklarimiz mrk gibi atama degil argument tir parametre gordugunuzde
// parametreli atama yaptiginizda bunu elle yazmamiz gerekir
// eger bunu contructorun icine koyarsak ana classta atariz
//constructor:Javada olusturulan objelere ilk deger atamasi initialize constructor tarafindan yapilir.
//biz classta bir constructor olusturmasak da o claadan obje olusturulabilir.
// cunku java her classa obje olusturmasi icin default constructor koyar
//default constructor parametresizdir bodysinde kod yoktur ve gorunme
//eger biz gorunur sekilde bir constructor olusturursak Java default constructoru siler
//constructorlar methoda benzerler ama method degillerdir bir kod blogunun method mu contructormu
//olduguu anlamak icin return type bakilir.
//constructorlarin return type i olmaz,ismi de class ismi ile ayni olmalidir ayrica statik de olmazlar.
//Default constructor kullanilarak olusturulan objeler standart ozelliklere sahip olurlar
// yani obje olusturulan classta variablelara hangi deger atanmissa o degerlere sahip olurlar.
//constructor kullanarak bir objeye ilk deger atamasi yapmak icin instance variablelarin bir kopyasini olusturur
// ve obje ile iliskilendirir boylece her instance variable in obje sayisi kadar kopyasi olur.
//parametrize biz bastan degerleri verelim o olusturuken degerleri versin.


