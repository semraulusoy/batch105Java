package ders07_NestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        //kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //kullaniciya musteri karti olup olmadigini sorun
        //musteri karti varsa 10 urunden fazla alirsa %20yoksa %15 indirim yapin
        //musteri karti yoksa 10 urunden fazla alirsa %15yoksa %10 indirim yapin


        int urunAdedi=7;
        boolean kartVarMi=true;
        double listeFiyati=12.5;
        double toplamFiyat=0;


        if (kartVarMi==true&&urunAdedi>=10){
            toplamFiyat=listeFiyati*urunAdedi*(0.8);
            System.out.println(toplamFiyat+"%20 indirimli kartli fiyat");
        } else if (kartVarMi==true && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat=(listeFiyati*urunAdedi*(0.85));
            System.out.println(toplamFiyat+"%15 indirimli kartli fiyat");
        }else if (kartVarMi==false && urunAdedi>10){
            toplamFiyat=(listeFiyati*urunAdedi*(0.85));
            System.out.println(toplamFiyat+"%15 indirimli fiyat");
        } else if (kartVarMi==false&&urunAdedi<10&&urunAdedi>0) {
            toplamFiyat=(listeFiyati*urunAdedi*(0.90));
            System.out.println(toplamFiyat+"%10 indirimli fiyat");}
        else {
            System.out.println("gecersiz giris");

        }


    }


    }

