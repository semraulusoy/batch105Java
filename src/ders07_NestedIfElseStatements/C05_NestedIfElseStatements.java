package ders07_NestedIfElseStatements;

import javax.swing.*;

public class C05_NestedIfElseStatements {
    public static void main(String[] args) {


        //kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //kullaniciya musteri karti olup olmadigini sorun
        //musteri karti varsa 10 urunden fazla alirsa %20yoksa %15 indirim yapin
        //musteri karti yoksa 10 urunden fazla alirsa %15yoksa %10 indirim yapin


        int urunAdedi = 25;
        boolean kartVarMi = false;
        double listeFiyati = 20;
        double toplamFiyat = 0;

        //ana degirken kart olsun


        if (kartVarMi){
            {
                if (urunAdedi < 0) {
                    System.out.println("hatali urun girisi");
                } else if (urunAdedi < 10) {
                    toplamFiyat = urunAdedi * listeFiyati * 0.85;
                    System.out.println("%15 indirimli fiyat" + toplamFiyat);
                } else {
                    toplamFiyat = urunAdedi * listeFiyati * 0.80;
                    System.out.println("%20 indirimli fiyat" + toplamFiyat);
                }}
        }else{
              if(urunAdedi < 0) {
                    System.out.println("hatali urun girisi");
              } else if (urunAdedi < 10) {
                    toplamFiyat = urunAdedi * listeFiyati * 0.90;
                    System.out.println("%10 indirimli fiyat" + toplamFiyat);
              } else {
                    toplamFiyat = urunAdedi * listeFiyati * 0.85;
                    System.out.println("%15 indirimli fiyat" + toplamFiyat);
                }


            }

            }

        }

