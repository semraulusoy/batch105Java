package ders23_constructors;

public class DAraba {


   // Bir proje olusturulurken tum classlarda main method olmasina gerek yoktur.
        // bir tane main class olusturulursa diger classlar obje ve method olusturmak icin kullanilan depolar olmus olur.
// biz de bu classi araba objelerini depolamak icin dizayn edelim.

    //her class olusturuldugunda java o classtan obje olusturulabilmesi icin
    //defaoult constructor  olusturur.
    // default conctructor parametresidir ve bize standart bir obje olusturur.
    // yani classda ne yapildiysa o

    //default constructor  parametresizdir bodysinde hicbir kod yoktur ve gorunmez
    // eger yeni bir constructor olusturursak default constructor silinir.
    //bir class da desoult constructur olup olmadigini anlamak icin gozle gordugumuz
    // bir constructor varsa defoult constructor orda olmaz

    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;



    public String toString() {
        return "Araba Ozellikleri " +
                "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyakit : " + yakit +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }

    public int maxHiz(String yakit){
        int maxHiz=120;


        if(yakit.equalsIgnoreCase("dizel")) {
            maxHiz = 200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz=230;

        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;

        }
      return maxHiz;
    }







}
//method isimleri kucuk harfle baslar class ismi ile ayni isimde ayni olmamasi tercih edilir.
//constructorlar syntax olarak methodlara benzerler ama return typlari yoktur
// ISIMLERI MUTLAKA CLASS ISMI ILE AYNI OLMALIDIR.
// condtructurlar buyuk harfle baslarlar.
//Static olarak tanimlanamazlar  public ya da defoult yapabilirsiniz ama static herkes tarafindan degistirilecegi icin yapilmaz
//method overloadingdeki gibi farkli signatirelara sahip istendigi kadar constructor olusturulabilir.
//constructorlar classin icerisinde merhodlarin ve diger contructurlarin disinda olusturulabilirler.