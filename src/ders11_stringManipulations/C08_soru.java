package ders11_stringManipulations;

public class C08_soru {
    public static void main(String[] args) {



   //Kullanicidan bir sifre isteyip asagidaki sartlari kontrol edin ve
    // kullaniciya duzeltmesi gereken tum eksikleri soyleyin
    //eger kullanici sartlari saglarsa "sifre basariyla kaydedildi " yazdirin
    //ilk harf kucuk harf olmali
    //son karakter rakam olmali
    //sifre bosluk icermememeli
    //uzunlugu en az 10 karakter olmali

    String sifre="Nasilsin Kardes";
    int bayrak=0;


        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }

        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("sifre en az 10 haneli olmali");
        }


        System.out.println(bayrak);

if (bayrak==0){
    System.out.println("sifreniz basariyla kaydedildi");}}}

        //birden fazla kontrol mekanizmaniz varsa hicbirinin negatifetkisi olup olmadigini anlamak icin bayrak koyariz.
