package ders16_doWhileLoop;

public class C04_DoWhile {
    public static void main(String[] args) {


        //kullanicidan bir pozitif sayi aliniz
        // sayinin tam kare olup olmadigini bulunuz
        // tamkare ise true degilse false yazdiriniz.


        int input=123;
        int baslangic=1;
        int bayrak=0;


        do{

       if (baslangic*baslangic==input){
          System.out.println("true");
          bayrak++;
          break;
    }
baslangic++;


        }while(baslangic*baslangic>input);
   if (bayrak==0){
       System.out.println("false");
    }
}}
