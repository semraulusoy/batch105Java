package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {
    public static void main(String[] args) {


        //kullanicidan bir string isteyin ve Stringi tersten yazin.

        // for loop eger javayla bir islemi belirli bir sayida calistimak istediginizde forLoop kullanilir.

        String input="Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));
//yazdirma oldugu icin harf harf cevirilir ve yazdirilir kaydetme farklidir diger soruda.


        }
    }
}