package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {


    String str="Java Candir";
        System.out.println(str.charAt(0));//ilk harfi verir J
        System.out.println(str.charAt(5));//Cverir

        //indekste ilk sayi 0 la baslar bosluk da bir karakterdir Java Candir charat 5 buyuk C verir

        System.out.println(str.charAt(10));//bana sonuncu karakteri verir r
        //Java Candir karakter sayisi 11 dir.son indeks ise 10 dur.
        // karakter sayisi 0 dan baslamaz klavyeye kac kere bastiginizi sorar.
        //indeks ise 0 dan baslar


        System.out.println(str.charAt(11));//StringIndexOutOfBoundsException
    }
}
