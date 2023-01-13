package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan toplanmak uzere sayi alin sayilarin toplami
        // 500 e esit olur veya gecerse;
        // girilen sayi adedi girilen sayilarin toplamini ve "bu kadar yeter" yazdirin


Scanner scan=new Scanner(System.in);
double girilenSayi=0;
double toplam=0;
int sayac=0;


while(toplam<500){

    System.out.println("toplamak icin sayi giriniz");
      girilenSayi=scan.nextDouble();
      toplam+=girilenSayi;
      sayac++;

}
        System.out.println("girilen "+sayac +"sayinin toplami"+toplam+"oldu.Bu kadar yeter");



/* while loop bazi durumlarda for loopdan avantajli olur.
bir loopun kac kere calisacagi belli degilse
veya bitis sarti loop degiskenine degil baska bir degiskene bagli ise
 while loop daha kullanisli olacaktir
 ornegin kullanicidan sifre istiyorsak
 ve yanlis oldugu muddetce tekrar istememiz gerekiyorsa
 adim sayisini bilmedigimizden while loop tercih edilir

*/

    }
}
