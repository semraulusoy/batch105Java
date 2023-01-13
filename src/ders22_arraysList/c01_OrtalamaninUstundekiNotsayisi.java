package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c01_OrtalamaninUstundekiNotsayisi {
    public static void main(String[] args) {


        //ogretmenden ogrenci notlarini alip bir list olusturun
        //ogretmen 100'den buyuk bir sayi girip bitirdiginde
        //sinif sayisinisinif ortalamasini ve kac kisinin ortalama ustunde not aldigini yazdirin

        List<Double> notlar = ListeOlustur();
        System.out.println(notlar);
        raporla(notlar);
    }

public static void raporla(List<Double>notlar){
    //sinif sayisinisinif ortalamasini ve kac kisinin ortalama ustunde not aldigini yazdirin


int ogrencisayisi=notlar.size();
double notlarToplami=0.0;
double sinifNotOrtalamasi=0.0;
int ortalamaUstundekiOgrenciSayisi=0;
//notlar toplamini bulalim


    for (int i = 0; i <notlar.size() ; i++) {

        notlarToplami+=notlar.get(i);

    }
//not ortalamasini bulalim
    sinifNotOrtalamasi=notlarToplami/ogrencisayisi;

    //ortalma ustundeki ogrenci sayisi

    for (int i = 0; i < notlar.size(); i++) {

        if(notlar.get(i)>sinifNotOrtalamasi){
            ortalamaUstundekiOgrenciSayisi++;


        }

    }

//rapor icin istenenleri yazdiralim

    System.out.print("girilen not sayisi: " +ogrencisayisi+
            "\ngirilen notlarin ortalamasi :"+sinifNotOrtalamasi
            +"\nortalama uzerinde not alan ogrenci sayisi"+ortalamaUstundekiOgrenciSayisi);
}

    public static List<Double> ListeOlustur() {
        List<Double> notlar = new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        Double girilennot=5.0;

        while(girilennot<=100){
            System.out.println("lutfen listeye eklemek icin not giriniz "+
                    "\nBitirmek icin 100 DEN BUYUK SAYI Yazin");
            girilennot= scan.nextDouble();

            if (girilennot<=100){
                notlar.add(girilennot);
            }
        }
        return notlar;

    }
}
