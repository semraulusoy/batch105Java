package ders08_Ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {


        //J:Java
        //D:Development
        //K:Kit
        //kullanicidan bir harf alin
        //alinan J,D,K'dan biri ise yukaridaki kelimeleri yazdirin
        //bu harflerden biri degilse "gecersiz harf"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        switch (harf){
            case 'J':
            case 'j':
            System.out.println("Java");
            break;
            case 'D':
            case 'd':
                System.out.println("development");
                break;
            case 'K':
            case 'k':
                System.out.println("Kit");
                break;
            default:
                System.out.println("gecersiz Harf");



                /* switch statementta dikkat edilmesi gereken konular
                1- switch parantezinde long,double,float ve boolean kullanilmaz
                2- switch statementta switch parantesine uygun case calisir ve break gorunceye kadar veya
                switch case bitinceye kadar calismaya devam eder
                break komutunu her caseden sonra kullanmak zorunda degiliz ancak bu durumda kodun
                 break gorunceye kadar devam edecegini unutmamamiz gerekir
                 caseleri gruplandirmak icin bu yontem kullanilabilir.
                 3- switch parantesine yazilan deger hic bir case ile uyusmazsa default satiri devreye girer
                  if else if lerin sonundaki else gibi davranir.
                 */


        }
    }
}
