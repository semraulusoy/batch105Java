package ders24_constructors;

public class Araba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;

        //yeni bir constructor olusturdugumuzda olusan instant variabllar o scoopun disina cikamazlar
       // orda tanimli olmalari icin bu scoopta anlaminda this kullanilir.
        //String ifadelerin deger atanmamis hali null olarak doner.

        //parametre isimleri ve intance variable isimleri ayni olursa atamalar direk yapmak istedigimizde
        //scope porblemi yasariz bu problemi asmak icin birbiriyle ayni olan isimlerin
        //hangisinin instance variable oldugunuthis. keywordu ile belirtmemiz gerekir.
    }

    public Araba(String mrk, String mdl){
    marka=mrk;
model=mdl;
}
    public Araba(){}

    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }

}
