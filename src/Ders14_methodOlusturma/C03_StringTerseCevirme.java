package Ders14_methodOlusturma;

public class C03_StringTerseCevirme {

    public static void main(String[] args) {

        //Parametre olarak bir string kabu edip string'in terse cevrilmis halini donduren bir method olusturun.


        String input="java kod yazdikca ogrenilir";

        System.out.println(TerscevirmeMethodu(input));
    }

    public static String TerscevirmeMethodu(String input) {
        String tersstr = "";
        for (int i = input.length() - 1; i >= 0; i--) {

            tersstr = tersstr + input.charAt(i);}
            return tersstr;


        }


    }
