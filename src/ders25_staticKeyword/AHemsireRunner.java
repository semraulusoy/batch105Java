package ders25_staticKeyword;

public class AHemsireRunner {
    public static void main(String[] args) {

        AHemsire h1=new AHemsire();
        h1.personelIsim="Ayse";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3123425465";

        System.out.println(h1);

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="sincan";
        h2.personelTelefon="3124323232";
        h2.bashekimIsmi="Yasar Kemal";

        System.out.println("h1: " +h1);
        System.out.println("h2: " +h2);


        AHemsire h3=new AHemsire();
        System.out.println("h3" +h3);
        h3.hastaneIsmi="Java Hastanesi";
        System.out.println(h2.hastaneIsmi);//Java Hastanesi

         //hastane ismi statik oldugundan otomatik yazilmiyor elde yazariz.
         //statik vclass uyesi olan bashekim ismine obje uzerinden h2.bashekim
        // olarak degilde direk class ismi uzerinden ulasabilirizyani AHemsire.bashekimIsmi= bu statik yontemdir.
        //statik variablelar rin diger adi class variabledirlar.bu variablelara ulasmak icin
        // classismi.variable ismi yazmamiz yeterlidir buna da static yontem denir

        //statik variablelar class a bagli oldugundan classin basinda olusturulur.
        // kac tane obje olusturulursa aolusturulsun ayni static variablelari kullanir.


        //bir methodu static yapmak icin return type dan once static keyword yazilir bunun nedeni de method
        // classta calisacagi icin main method statik oldugundan statik olmasi lazim klup uyesi olayi
        //statik olan methodda static olmayan variable calismaz
        //methos static degilse hersey kabul edilir statik olanda olmayanda girebilir
        //static heryere gire ama kendi icine statik olmayanlari almaz
    }

    //java da kalicilik  class calistigi muddetce kalicidir.Bir class calistigi muddetce statik variable uzerinde yapilan degisiklikler
    // class durana kadar  kalici olur.
}
