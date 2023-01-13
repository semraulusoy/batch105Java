package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {


        // kullanicidan bir String isteyin ve Stringi tersine cevirip kaydedin.

       String input="Java her gecen gun guzellesiyor";
        String tersInput="";

        for (int i = input.length()-1; i >= 0; i--) {

         tersInput+=input.substring(i,i+1);
            System.out.println("Ters hali : "+tersInput);

        }
    }
}
