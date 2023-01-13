package ders22_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {

        //soru: Kullanicidan pozitif bir tam sayi alip
        // o tam sayiyi bolebilen tum pozitif sayilari bize donduren
        // bir method olusturun

        int input=28;
        tamBolenlerListesiOlustur(input);
        System.out.println(tamBolenlerListesiOlustur(input));


    }
    public static List<Integer>tamBolenlerListesiOlustur(int input) {
        List<Integer> tamBolenlerListesi = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                tamBolenlerListesi.add(i);
            }
        }
            return tamBolenlerListesi;
        }
    }
//bir listte elementleri siralama CoLections.sort(list)
//isterseniz listenin belli bir bolumunu alabilirsiniz  list.subList(baslangicindeksi,bitis indeksi)


