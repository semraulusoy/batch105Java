package ders28_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);

    }
    public static void topla(int...sayi1){
        System.out.println("x sayinin toplami : "+(sayi1));
    }
}
