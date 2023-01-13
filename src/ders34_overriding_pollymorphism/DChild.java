package ders34_overriding_pollymorphism;

public class DChild extends CParent {
    public void method1() {

    }

    /*
    OVERRIDING KURALLARI
   1- overriding olmasi icin method isminin ve signaturenin ayni olmasi gerekir.
    2-access modifier method signature a dahil olmadigindan overridden ve overriding
    access modofierlar farkli olabilir
    protected public ok
    protected default olmaz
    3-Child parenti sinirlandiramaz yani child classtaki
    overriding methodun access modifieri daha genis kapsamli olmalidir
    public protected dan daha genistir


    PRIVITE--DEFAULT--PROTECTED--PUBLIC
    Child classtaki access modifier ya ayni ya da daha genis olmalidir.

    2-Privite ve static methodlar override edilemez
    protected static void method2(){} bunu override edemeyiz statik silinirse override edilir.
    ayni isimde method olusturunca java cte vermez ancak override isareti cikmaz ve
    override notasyonu kullanilmak istenirse cte olur/
    asagidaki ikisi parenttakilerin override metodlari degil
    farkli classlardaki farkli methodlar olarak kabul eder

    public static void method2(){}

    private void method3(){}


    3- return typelari method signature ina dahil olmadigindan farkli secilebilir
    .return type void veya primitive ise ayni olmak zorundadir.eger return type lar non primitive ise
    child classdaki return type parent class daki return type i ile aynidi veya childi olmalidir
    parentin return type i parent olmalidir.object classi butun classlarin parentidir.
     parenti olayan tek class object classtir

    4-STATIC,FINAL ve PRIVATE methodlar override edilemez
      parent classdaki final veya static olarak isaretlenen bir method
       ile ayni isimde bir methodu child classda olusturursaniz Java CTE verir.
       parent classdaki PRIVATE olarak isaretlenen method ile ayni isimde bir method
       child classda olusturulursa Java cte vermez baska method gibi dusunur


     */


    public static void method2() {
    }

    private void method3() {
    }
  public void method4(){}

    public Integer method5(){

        return 5;
    }



}