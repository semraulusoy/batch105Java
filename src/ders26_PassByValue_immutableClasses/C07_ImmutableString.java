package ders26_PassByValue_immutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {


        String str="Java Candir";
         str=str.toUpperCase();
        System.out.println(str);//JAVA CANDIR
       // immutable classlardan olusturulan bir objenin degeri degistirilemez.
        // immutable classlarda atama yaptigimiz zaman Java degerini degistirmez bunun yerine yeni bir obje olusturur
        //ve bu yeni objeye yeni atadigimiz degeri atar.

        //eski obje bosa cikar ve garbage collector tarafindan silinmeyi bekler.
    }
}
