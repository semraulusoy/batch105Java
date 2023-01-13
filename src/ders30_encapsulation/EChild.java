package ders30_encapsulation;

public class EChild  extends DParent{

    /*

    Java Inheritance in insanlardan en buyuk farki
    insanlarda parent child edilebilir ama child parentini secemez
    Java da ise tam tersidir yani siz bir class olusturdugunuzda daha once
    olusturdugunuz classlardan tum ozelliklerini inherit etmek istediginiz claai paren edebilirsiniz.
    bir class baska bir classi inherit etmek istediginde expend keyword ile bunu declare eder.





      */
    public static void main(String[] args) {
       EChild child1=new EChild();
       child1.yas=30;
       child1.isim="Mahmut";
       child1.isEnough=false;


    }



}
