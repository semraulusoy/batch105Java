package Ders14_methodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {


        //verilen iki String parametre olarak kabul edip
        //bu  iki stringi aralarinda bir bosluk olan tek bir string
        //main methoda donduren bir method olusturun


        String str1="Java";
        String str2="Candir";
        System.out.println(birlestirmeMethodu(str1,str2));
        System.out.println(birlestirmeMethodu("Java","Candir"));
    }

    public static String birlestirmeMethodu(String str1,String str2){
        return  str1+" "+str2;
    }
}

