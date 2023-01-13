package ders10_stringManipulations;

public class C04_endsWith {
    public static void main(String[] args) {


         String str="java heryerde guzel";


        System.out.println(str.endsWith("guzel"));  //true

        System.out.println(str.endsWith("")); //true

        System.out.println(str.endsWith("java heryerde guzel"));//true

        System.out.println(str.endsWith("Java"));//false


    }
}
