package ders10_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {


        String str="Java cok guzel,cok.";

        //bir stringin baska bir strinle baslayip baslamadigini kontrol eder boolean sonuc dondurur
        //iki kullanim sekli vardir tek parametreli olursa str nin bas kismini kontrol eder.


        System.out.println(str.startsWith("J"));//true
        System.out.println(str.startsWith("Java"));//true
        System.out.println(str.startsWith("Java cok guzel,cok."));//true
        System.out.println(str.startsWith(""));//true


        //2 parametreli olursa javaya baslangic indeksi olarak hangi indeksi kullanmasini istedigimizi verebiliriz.
        //ornegin 5. indeks ve sonrasi "cok"ile mi basliyor diye kontrol edebiliriz.

        System.out.println(str.startsWith("cok",5));//true
        // 5. indeks sonrasi cok lami basliyor

        System.out.println(str.startsWith("guzel",10));//false




    }





}
