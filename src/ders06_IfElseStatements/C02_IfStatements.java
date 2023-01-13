package ders06_IfElseStatements;

import ders02_dataturleri_scanner.C04_Scanner;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {



        //Kullanicidan bir ucgenin uc kenar uzunlugunu alin
        // ucgen eskenar ucgense "eskenar ucgen" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kenarini giriniz");

        int kenar1= scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgen");

    }
}}
