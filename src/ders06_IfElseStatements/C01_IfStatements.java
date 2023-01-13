package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {


        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        //kullanici o veye O yazdiginda outout Ocak olsun.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay isminin ilk harfini giriniz");

        char ilkHarf = scan.next().charAt(0);
        if (ilkHarf == 'O' || ilkHarf == 'o') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 'S' || ilkHarf == 's') {
            System.out.println("subat");
        }
        if (ilkHarf == 'M' || ilkHarf == 'm') {
            System.out.println("mart veya Mayis");

        }

        if (ilkHarf == 'H' || ilkHarf == 'h') {
            System.out.println("haziran");
        }
        if (ilkHarf == 'T' || ilkHarf == 't') {
            System.out.println("Temmuz");
        }

        if (ilkHarf == 'A'|| ilkHarf == 'a'){
            System.out.println("agustos veya Aralik");
        }
        if (ilkHarf == 'E' || ilkHarf == 'e') {
            System.out.println("eylul veya Ekim");
        }
        if (ilkHarf == 'K' || ilkHarf == 'k') {
            System.out.println("Kasim");
        }
    }
}

