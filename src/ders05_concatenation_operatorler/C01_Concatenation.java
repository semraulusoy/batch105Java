package ders05_concatenation_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {


        //sadece asagida verilen variablelari kullanarak istenen degeri yazdirin

        String s1= "Java";
        String s2="Guzeldir";
        String s3="";
        String s4= " ";
        int sayi1=4;
        int sayi2=3;

        //java guzeldir7


        System.out.println(s1+s4+s2+(sayi1+sayi2));


        // 34 Java

        System.out.println(s3+sayi2+sayi1+s4+s1);
         //Java7 guzeldir43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi2+sayi1);


        // Java guzeldir 12

        System.out.println(s1+s4+s2+s4+sayi1*sayi2);
    }
}
