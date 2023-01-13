package ders08_Ternary_switch;

public class C05_NestedTernary {
    public static void main(String[] args) {

       /* Kullanicidan bir tamsayi alin.
        Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        */

        //System.out.println(a>0?sayi pozitifse calisacak kod):sayi pozitif degilse calisacak kod);

        //a%2==0;"sayi cift sayi":"sayi cift sayi degil"(pozitifse yazilacak kod)

        //  a<=-100&&a>-1000?"uc basamakli":"uc basamakli degil"(sayi negatifse yazilacak kod)


        int sayi = 20;
        if (sayi > 0) {


            //cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin


            System.out.println(sayi % 2 == 0 ? "cift sayi" : "cift sayi degil");
        } else {

            //3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin


            System.out.println(sayi < -99 && sayi > -1000 ? "uc basamakli sayi" : "uc basamakli degil");
        }


        String sonuc = sayi > 0
                ?

                (sayi % 2 == 0 ? "cift sayi" : "cift sayi degil")
                :
                sayi < -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil";


        //String sonuc = sayi > 0 ? (sayi % 2 == 0 ? "cift sayi" : "cift sayi degil") : sayi < -99 && sayi > -1000 ? "uc basamakli" : "uc basamakli degil";

    }
}

//ternary operatoru basit islemlerde kullanilmak uzere dizayn edilse de
// bazen kolpleks islemleride ternary le yapmak isteyebilirsiniz (Tavsiye edilmez)


