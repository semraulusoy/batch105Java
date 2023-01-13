package ders24_constructors;

//konsolda ne yazdirir.
    public class Deneme {
        String isim = "John Doe";
        int yas = 40;


        public Deneme() {
            isim = "Seher";
            yas = 38;
        }


        public Deneme(String isim, int yas) {
            this();
            this.yas = yas;

        }


        public static void main(String[] args) {
              Deneme obj1=new Deneme();
              Deneme obj2=new Deneme("Fatih",35);


            System.out.println("isim : " + obj1.isim +
                    "\nyas : " + obj2.yas);
        }
    }

//bir classdaki costructor calisirken ayni classdan veya farkli bir class dan bir constructor in
// daha calismasi gerektiginde constructorcall yapilir
//CONSTRUCTOR CALL this(parametreler)icin
//this() constructorun ilk satirina yazilir.
//bir constructorun icerisinde sadece bir constructor call yapilabilir.





    // birinci satira geliriz main methoddan baslariz.altindaki sirada parametresiz constructor daki standart degerler atanir.
// parametresiz constructor dayazan isim: seher atanir.sonra 6. adim iki parametreli contructor verilmis yukarda
// iki parametreli contructura gidilir isim fatih yas 35 olur.
 //This() constructor call demektir bunu gordugumuzde baska bir constructorun calimasini istedigini anlariz yanindaki
// bos  parantez parametresi constructor a girmemizi soyler.tekrar parametresiz contructura donersek
// isim degisir seher olur yas 35 olarak kalir sonra sout a gelir ve istenileni yazdirir.
