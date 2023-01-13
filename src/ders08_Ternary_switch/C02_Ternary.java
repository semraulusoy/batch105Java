package ders08_Ternary_switch;

public class C02_Ternary {
    public static void main(String[] args) {


        //verilen iki metin birbiri ile ayni ise "metinler ayni"
        //farkli ise "metinler farkli" yazdirin

        String str1="Ali";
        String str2="ali";

        //non primitivelerde == calismaz Stringde iki metnin esit olup olmadigini anlamak
        // icin eguals kullanilir.

        if (str1.equals(str2)){
            System.out.println("Metinler ayni");
        }else{
            System.out.println("metinler farkli");
        }
        System.out.println(str1.equals(str2)?"metinler ayni":"metinler farkli");

    }}

