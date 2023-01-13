package ders10_stringManipulations;

public class C10_isEmpty {

    public static void main(String[] args) {


        String str="";
        System.out.println(str.isEmpty());//true


        //is empty metodu hiclik tanimlar is blank bosluk tanimlar


        str=" ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

        str="x";

        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false

    }
}
