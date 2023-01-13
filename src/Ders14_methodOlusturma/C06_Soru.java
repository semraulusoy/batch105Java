package Ders14_methodOlusturma;

public class C06_Soru {

    public static void main(String[] args) {
        /* Kullanicidan main method icinde ayri ayri isim ve soy isim alin
         isim ve soyismin ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip
          isim bosluk soyisim seklinde bize donduren bir method olusturun
         input isim ali soy isim yilmaz output:Ali Yilmaz
         */

        String isim="Ali";
        String soyisim="Yilmaz";
        System.out.println(isimsoyisimduzenle(isim,soyisim));

    }
    public static String isimsoyisimduzenle(String isim, String soyisim) {
        String yeniisimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                " " +
                soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).toLowerCase();

    return yeniisimSoyisim;
    }

    }

