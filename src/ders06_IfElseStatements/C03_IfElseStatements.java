package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise "eskenar ucgen" yazdirin
        // degilse "eskenar degil"yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar ucgen degil");
    }
}}

//java 0 ve _ deger verirsek bunda gene ucgen dir der bu javanin degil bizim kodu
// yazmamizla alakalidir. Sart olarak sifirdan buyuk yazmamiz lazimdir.ifelseif

