package ders39_AbstractClasses;

public class CHondaCivic extends BHonda{

    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknolojili motorlar kullanir");

    }

    @Override
    public void kasa() {
        System.out.println("Civic sedan veya Hatchback kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("civic araclar 205x55x16 teker kullanir");

    }

    @Override
    public void yakit() {
        System.out.println("civic araclar benzinle calisir");

    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik sistemi kullanir");

    }

    @Override
    public void abs() {
        System.out.println("civic araclar abs kullanir");

    }

    public static void main(String[] args) {
        //Abstract classlardaki abstract methodlar
        // concrete child classlarda tarafindanmecburen override edilir
        //ancak abstract parent classlardaki concrete methodlari override etmek mecburi degildir.
        //eger child classa uyarlamak isterseniz override edebilirsiniz veya override etmeyip
        //parent classdaki haliyle kullanabilirsiniz

        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();// civic
        civic1.klima();//Araba
        civic1.marka();//Honda
        civic1.ozelTeknoloji();//Honda
    }
}
/*Kural 1: Abstract bir class'i parent edinen concrete class'lar, abstract class'da abstract olarak tanimlanmis tum method'lari override etmek zorundadir.
Kural 2: Bir class'i abstract class yapmak icin class keyword'den once abstract keyword
kullanilir.

Kural 3: Bir method'u abstract method yapmak icin return type'dan once abstract
keyword kullanilir.
Abstract method'lar mutlaka child class'larda override edileceginden
body'si olmaz

Kural 4: Abstract class'lar abstract veya concrete(abstract olmayan) method'lar
bulundurabilirler. Ancak concrete class'larda abstract method ollusturulamaz.

Kural 5: Bir abstract class'daki abstract method'lar override edilmek zorundadir ancak,
abstract class'daki concrete method'lar icin mecburiyet yoktur(opsiyonel).

Kural 8: Abstract class'lar class olduklari icin constructor'lari vardir ama abstract
class'lardan obje olusturulamaz.
Kural 9: final ve private method'lar override edilemeyecekleri icin, abstract method'lar
final veya private olarak tanimlanamaz.

 */