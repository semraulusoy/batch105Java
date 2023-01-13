package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        //kullanicidan ismini,soyismini ve yasini alip asagidaki formata gore yazdirin
        // isminiz : John
        // Soyisminiz: Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz "  );

        //string icin kullanilabilen next() sadece ilk space e kadar olan kismi alir
        // nextLine() ise o satirda yazilan tum bilgiyi alir


         String isim= scan.nextLine();

        System.out.println("lutfen soyadinizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("lutfen yasiniz giriniz");

        double yas = scan.nextDouble();

        System.out.println("isminiz : "  + isim + "\nsoyisminiz : " + soyisim +
                "\nyasiniz :" + yas + "\nKaydiniz basariyla tamamlanmistir.");




    }
}
