package ders34_overriding_pollymorphism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("child class method1");
    }
    public void method2(int a){
        System.out.println("child class method2");

        //overriding olabilmesi icin hem method ismi hemde method signature ayni olmalidir
    }
    public void method2(String isim) {
        System.out.println("Child class String parametreli method2");}

    @Override//java kendi olusturunca bu notasyonu koyar.
    public void method3()  {

    }


    /*super.method3(); bunu gorurse once parenttakini sonra gelip bulundugu classtakini calistirir
      overriding varsa parent ve child classdaki overridden ve overriding methodlardan sadece biri calisir.
      eger ikisini birden calistirmak isterseniz super.overriddenmethodismi() yazilir

      12.siradaki methodun override ettigi  parent clastaki methodu silsekte method2 bagimsiz method halinde calisir.
      ancak 15. satirdaki@override in override ettigi paarent calsstaki methodu silersek ariza verir overridden methodun
       silinmesini engellemek icindir.
     */

}
