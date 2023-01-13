package ders30_encapsulation;

public class AEncapsuleClass {

    private String hastaneIsmi="Yildiz Hastanesi";
    //hastane ismi gorulsun ama degistirilemesin


    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private int hastaUcreti;
    //hasta ucretleri de giris yapilabilsin ucreti sigortadan alinacagi icin personel hasta ucretlerini gormesin
    private String hemsireIsmi;
    private String hemsireAdresi;

    //bu instance variablelara herkes ulasabilsin
    //bu durumda public yapmak akla gelen ilk cozum olacaktir.

    //bu variablelari public yapmak yerine
    // private yapip getter ve setter olusturmak da
    // ayni islevi gorur.

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
