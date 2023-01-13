package ders23_constructors;

public class HAraba {
    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;
public HAraba(String mrk,String mdl,int yl){

    // istersek parametreleri azaltarak da constructor olustura biliz.

    marka=mrk;
    model=mdl;
    yil=yl;
}

public HAraba(String mrk,String mdl,String ykt,int yl, int fyt){
    marka=mrk;
    model=mdl;
    yakit=ykt;
    yil=yl;
    fiyat=fyt;



}


    public HAraba(){}
    //gorunur durumdaki parametresiz constructor default constructor degildir.
    //default constructorun body si de bos olur
    // ancak parametresiz constructorda bodye kod yazilabilir.
    //parametresiz constructorun bodysinde kod yoksa default constructor ile
    // ayni isleri gorur ama yine de gorunur durumdaysa default constructor denmez.



    //biz gozle gorulur henhangi bir constructor olusturdugumuzda
    // Java default constructoru siler.
    // Bu durumda daha once olusturulmus objelerin  sorun olmamasi icin
    // classa parametresiz bir constructor eklememiz faysali olur.

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
