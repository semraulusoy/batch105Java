package ders10_stringManipulations;

public class C06_indexOf {
    public static void main(String[] args) {


        //bir string icerisine aldigimiz bir string veya char degerin ilk kullanim indexini dondurur
        //iki parametre kullanirsak aramaya hangi indexden baslayacagini da soyleyebiliriz.
        //indexOf methodunun 4 cesidi vardir int char, string str, int ch -int fromindex,string str-int fromindex
        // yalniz bunlarin hersi integer dondurur.



        String str= "Ahmet hoca ile hersey clear";


        System.out.println(str.indexOf("a"));//ilk a'nin bulundugu indexi bana getirir.
        System.out.println(str.indexOf('c'));//ilk c nin bulundugu indexi verir hem stirng hem char ifadeleri dondurur.
        System.out.println(str.indexOf("hersey"));//birden fazla harften olusan bir blogunuz yani chars sequence niz varsa
                                                  // basladigi ilk harfi verir.

        System.out.println(str.indexOf("e",9));//9 dan sonraki ilk e

        //13. e den sonraki e yi bulmak icin
        System.out.println(str.indexOf("e",13));//13 verir bu olmaz.
        System.out.println(str.indexOf("e",14));//dememiz lazim
        //cumledeki ikinci c nin indexini bulunuz.

        int ilkcindexi=str.indexOf("c");//8
        System.out.println(str.indexOf("c",ilkcindexi+1));//22 yazdirir.

        //iki sout lada yapilir ama bu sekilde gecici variable atamak daha guzel olur.

        System.out.println(str.indexOf("ali"));//index olarak int dondurur ama bu metin cumlenin icinde yok
                                               //0 diyemez 0 derse cumlenin basinda demektir eger yoksa -1 dondurur
                                               //olmayan degerler icin -1 doner


    }
}
