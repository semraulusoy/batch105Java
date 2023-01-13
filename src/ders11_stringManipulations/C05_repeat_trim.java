package ders11_stringManipulations;

public class C05_repeat_trim {

    public static void main(String[] args) {

        String str="Java guzeldir ";

        System.out.println(str.repeat(4));//Java guzeldir Java guzeldir Java guzeldir Java guzeldir

        str="   Java guzeldir   ";//bir stringin basindaki ve sonundaki bosluklardan kurtulmak icin trim kullanilir
        System.out.println(str.length());
       str=str.trim();
        System.out.println(str);
        System.out.println(str.length());


    }
}
