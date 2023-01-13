package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        //kullanicidan istedigi kadar sayi alip bir array olusturun
        //Kullanici eleman girisini bitirmek icin 0 a bassin


        Scanner scan=new Scanner(System.in);
        int[]arr={0};

        int girilensayi=0;

        do {
            System.out.println("arraye eklemek icin bir tam sayi giriniz"+"\nBitirmek icin 0 a basin");

            girilensayi=scan.nextInt();


            if (arr[0]==0){
                arr[0]=girilensayi;

            }else if(girilensayi!=0){
              arr=  C08_ArrayeElemanEklemeMethodu.arrayeElemanEkle(arr,girilensayi);
            }





        }while (girilensayi!=0);

        System.out.println(Arrays.toString(arr));
    }
}
//Array ayni data turunden burden fazla veri barindirabilen java objeleridir.

//bir array olusturulurken data turu ve length deklare edilmek zorundadir

//bir array iki sekilde olusturulabilir.
// int[]arr={3,5,6}
//int[]arr2=new int[5];//[0,0,0,0,0]
//ikinci olusturma seklinde uzunlugu 5 olan bir array olusturur

// ve tum elementlerine data turune uygun default degerler atar

//bir arrayin uzunlugu sabittir ve olusturulduktan sonra degistirilemez.

//var olan bir arraye yeni bir eleman eklememiz sart ise
//-once lengthi eski arrayden bir fazla olan yeni bir array olusturulur
//-eski arraydeki tum elementler ayni indekslere yeni array atanir
//-eklenecek element de son indekse atanir.
//-yeni array son halini aldiktan sonra eski arraye yeni array deger olarak atanir.

//bir arrayin tum elementleri ile islem yapmak istersek
// forLoop ile tum elementleri tek tek islemden gecirebiliriz.

//String split()bir Stringi istedigimiz ayirac ile parcalara bolup bir array olusturur.
//bu arrayi kullanmak icin biz de esitligin solunda bir array olusturup olusan arrayi atama yapariz.