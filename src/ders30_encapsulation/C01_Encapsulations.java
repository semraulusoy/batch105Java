package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {


        AEncapsuleClass pers1=new AEncapsuleClass();
       // pers1.hastaneIsmi="Java hastanesi" kullanamayin private oldugundan
        //pers1.hastaUcreti=10000 private oldugundan kullailamaz

        //pers1.hemsireAdresi="Ankara"; private oldugundan ulasilamaz
        //pers1.hemsireIsmi="Yildiz Yildiz";private oldugundan ulasilamaz

        System.out.println(pers1.getHastaneIsmi());
        //bize string getiyor ama variable degil atama yapamayiz


        pers1.setHastaUcreti(500);
        //sadece atayabiliriz yazdirmaniz mumkun olmaz deger ata diyor atiyor goremeyiz

        //getter ve setter methodlari bazen de erisimi sinirlandirmak icin degil
        // kullanicinin islevi iyi anlamasiicin kullanilir.
        //set data girisi demektir yazdiramayiz


        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("istanbul");
        System.out.println(pers1.getHemsireIsmi());



    }
}
