package ders04_matematikselislemler_incrementdescrement;

public class C04_RakamlarToplami {
    public static void main(String[] args) {
        // kullanicinin girdigi 4 basamakli bir sayinin rakamlar toplamini veren bir kod yaziniz

        int input= 1453;

        int birlerBasamagi=0;
        int rakamlartoplami=0;


        birlerBasamagi= input %10;

        rakamlartoplami= rakamlartoplami+birlerBasamagi;

        input=input/10;

        birlerBasamagi= input %10;

        rakamlartoplami= rakamlartoplami+birlerBasamagi;

        input=input/10;


        birlerBasamagi= input %10;

        rakamlartoplami= rakamlartoplami+birlerBasamagi;

        input=input/10;


        birlerBasamagi= input %10;

        rakamlartoplami= rakamlartoplami+birlerBasamagi;

        input=input/10;


        birlerBasamagi= input %10;

        rakamlartoplami= rakamlartoplami+birlerBasamagi;

        input=input/10;
        System.out.println("verilen sayinin rakamlar toplami:"+ rakamlartoplami);



    }
}
