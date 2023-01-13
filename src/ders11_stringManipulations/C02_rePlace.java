package ders11_stringManipulations;

public class C02_rePlace {
    public static void main(String[] args) {


       // replace ya bir karakteri baska bir karakterle degistiriyorsunuz.
        // char sequence yerine yeni seguence string koyabbiliriz bize string dondurur


        String str="Java candir";
        System.out.println(str.replace('a','A'));//JavA cAndir.
        System.out.println(str.replace(' ','_'));//Java_candir
        System.out.println(str.replace("candir","cok guzeldir"));//Java cok guzeldir
        System.out.println(str.replace("a",""));//Javacandir
        System.out.println(str.replace("a",""));//Jv cndr

        //Java yerine hava,candir yerine cok guzel yazdiralim
        //replace . koyarak istedigimiz kadar ayni method icinde yazdirabiliriz

        System.out.println(str.replace("Java","Hava")
                .replace("candir","cok guzel"));

        System.out.println(str.replace("","_"));//_J_a_v_a_ _c_a_n_d_i_r_


        //sadece 1.a yi A yapin

        System.out.println(str.replaceFirst("a","A"));



    }
}
