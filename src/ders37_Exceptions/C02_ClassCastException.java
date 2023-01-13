package ders37_Exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {
        short sayi1=23;
        int sayi2=sayi1;
        short sayi3=24;
        //  Integer sayi=sayi3; Integer ve short arasinda parent child iliskisi olmadigindan birbirine atama yapamazsiniz
      Object obj=sayi3;
        System.out.println("Shorttan objeye cast edince : "+obj);//24

      //Integer icin olmayan Obje icin neden oldu cunku Obje classi butun claaslarin parenti

        Integer sayi5=(Integer) obj;

        //bunu kabul etmez aralarinda parent child iliskisi olsa da integer objectden dardir bunu kendiniz yapabilirsiniz.
        //aralarinda parent-child iliskisi olan classlardan olusan objeler icin autowidening veya exlicipt narrowing mumkundur.


        System.out.println("Short datayi obje uzerinden Integera cevirince: "+sayi5);
        //ClassCastException
    }
}
