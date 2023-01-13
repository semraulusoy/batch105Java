package ders11_stringManipulations;

public class C01_nullPointer {
    public static void main(String[] args) {



        String str1="";
        //str1 e bir deger yazdirir


        System.out.println(str1);// hiclik
        System.out.println(str1.concat("java"));//Java

        String str2;

        // str2 olusturuldu ama deger atanmadi

        //System.out.println(str2); CTE verir str2 ye deger atanmadigi icin yazdirilmaz

       // System.out.println(str2.concat("Java")); deger atanmadigi icin methodla calismaz

        str2="Java candir";
        System.out.println(str2);//Java candir
        System.out.println(str2.concat("."));// Java candir.


        String str3=null;//str3 e deger atanmamistir
        // null pointer ile Javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz


        System.out.println(str3);//null isaretlendigini yazdirir

        //System.out.println(str3.concat("Java"));//null pointer exception

        System.out.println(str3+"Java");//nullJava
       // System.out.println(str3.toUpperCase());// null pointer exception


//ben aslinda yogumm yogum deger degil isaretcidir.null pointer seklinde soylemek lazim null diye degil
    }
}
