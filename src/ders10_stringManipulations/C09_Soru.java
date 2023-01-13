package ders10_stringManipulations;

public class C09_Soru {
    public static void main(String[] args) {

        //kullanicidan bir cumle ve bir metin alin cumledeki metnin durumuna gore
        // 1. cumle metni icermiyor
        //2. cumle metni sadece 1 kere iceriyor
        //3. Cumle metni birden fazla iceriyor
        //seceneklerinden uygun olani yazdirin

        String cumle="Java cok guzeldir cok";
        String metin="cok";

        int ilkindex=cumle.indexOf(metin);
        int sonindex=cumle.lastIndexOf(metin);


        if (ilkindex==-1){
            System.out.println("cumle metni icermiyor");} else if (ilkindex==sonindex) {
            System.out.println("cumle metni bir kere iceriyor");}else {
            System.out.println("cumle metni birden fazla iceriyor");

        }
    }
    }

