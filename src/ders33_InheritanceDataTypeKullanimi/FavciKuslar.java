package ders33_InheritanceDataTypeKullanimi;

public class FavciKuslar {

   public class FAvciKuslar extends EKuslar {


       public void hareket() {
           System.out.println("Avci kuslar ucarlar");
       }

       public void beslenme() {
           System.out.println("Avci kuslar et yerler");
       }

       public void pence() {
           System.out.println("Avci kuslar penceledir");
       }

       public void gaga() {
           System.out.println("Avci kuslar gagaldır");
       }
   }
       public void main(String[] args) {
//Bir obje olusturulurken constructor ve data turu ayni ise hangi methodu n gecerli oldugunu bulmak icin
// o classa gider varsa kullaniriz yoksa sirasiyla parentlara gider ilk buldugumuzu kullaniriz.

               FAvciKuslar avci1=new FAvciKuslar();
               avci1.beslenme();//Avci Kuslar
               avci1.gaga();//Avci kuslar
               avci1.pence();//Avci kuslar
               avci1.hareket();//Avci kuslar
               avci1.cogalma();//Kuslar
               avci1.kanat();//Kuslar
               avci1.omur();//hayvanlar
               avci1.solunum();//kuslar

           //Bir obje olusturulurken data turu ile konstructor farkli ise hangi methodun calisacagini
           // bulmak icin once data turunun oldugu classve parent larina bakarak o methodu buluruz.
           // Bulamazsak CTE verir bulursak HEMEN CALISTIRMAYIZ. ccalistirmadan once o method
           // override edilmis mi diye bakariz override edilmisse override methodu calistiririz.

           EKuslar avci2=new FAvciKuslar();


               avci2.beslenme();//avci kuslar
               avci2.gaga();//avci kuslar
               //avci2.pence(); data turunun oldugu classta ve onun parentinda yok o yuzden CTE
               avci2.hareket();//hayvanlar classinda var ama kullanmadik guncellenmismi diye bakariz
                                // avci kuslarda var onu kabul ettik
               avci2.cogalma();//kuslar
               avci2.kanat();//kuslar
               avci2.omur();//Hayvanlar
               avci2.solunum();//kuslar
//digerleri bulursa hemen yazdirmaz guncellenmis mi bakar overriding edilmis olanini kabul eder

DHayvanlar avci3=new FAvciKuslar();


               avci3.beslenme();//Avci kuslar
               //avci3.gaga();//CTE
               //avci3.pence();//CTE
               avci3.hareket();//Avci kuslar
               avci3.cogalma();//Kuslar
               //avci3.kanat();//CTE
               avci3.omur();//Hayvanlar
               avci3.solunum();//Kuslar

           EKuslar kus1=new EKuslar();
           kus1.cogalma();//kuslar
           kus1.gaga();//kuslar
           kus1.kanat();//kuslar
           kus1.hareket();//hayvanlar
           kus1.solunum();//kuslar
           kus1.beslenme();//hayvanlar
           kus1.omur();//hayvanlar
//data turuyle constructor ayniysa buldugumuzu aynen kullaniriz
           //methodlar la belirlenen ozelliler en guncel halini kullanirlar dinamiktirler
           // variablelar ile belirlenen ozellikler  ilk bulduklarini kullanirlar statiktirler

           DHayvanlar kus2=new EKuslar();
           kus2.cogalma();//kuslar
           //kus2.gaga();//CTE
           //kus2.kanat();//CTE
           kus2.hareket();//hayvanlar
           kus2.solunum();//kuslar
           kus2.beslenme();//hayvanlar
           kus2.omur();//hayvanlar
    }
}
//bir child classta parent classla ayni method varsa parenttaki gecersiz kilinmistir
//kendi classindaki solunum methadu gecerlidir.bir child classta parentiyla ayni isimda ve signuteda method varsa bu overriding olarak isimlendirilir
//gecersiz olan overridden gecerli olan override methoddur
