package ders18_arrays;

public class C07_EnKIsaEnUzunKelime {
    public static void main(String[] args) {


        //verilen String bir arraydeki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    // esitlik durumunda bir sonrakini alir

        String[]arr={"hasan","Adem","senturk","omer Faruk"};

         enUzunEnKisaIsimleriYazdir(arr);
    }
    public static void enUzunEnKisaIsimleriYazdir(String[]arr){

        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length()>enUzunKelime.length()){
                enUzunKelime=arr[i];
            }

            if (arr[i].length()<enKisaKelime.length()){
                enKisaKelime=arr[i];
            }

        }

        System.out.println("en uzun isim ="+enUzunKelime);
        System.out.println("en kisa isim ="+enKisaKelime);

    }

}
