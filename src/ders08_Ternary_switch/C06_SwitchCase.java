package ders08_Ternary_switch;

public class C06_SwitchCase {
    public static void main(String[] args) {


        //kullanicinin girdigi gun numarasinin
        //gun ismini yaziniz

        int gunNo=3;

      /*  if (gunNo==1){
            System.out.println("Pazartesi");
        }else if (gunNo==2){
            System.out.println("sali");
        } else if (gunNo==3) {
            System.out.println("Carsamba");
        } else if (gunNo==4) {
            System.out.println("Persembe");
        } else if (gunNo==5) {
            System.out.println("Cuma");
        } else if (gunNo==6) {
            System.out.println("cumartesi");
        } else if (gunNo==7) {
            System.out.println("pazar");
        }else{
            System.out.println("gecersiz gun numarasi");
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen bir sayi giriniz");
            int rakam= scan.nextInt();



            if (rakam==1){System.out.println("Pazartesi");}
            else if (rakam==2) {System.out.println("Sali");}
            else if (rakam==3) {System.out.println("Carsamba");}
            else if (rakam==4) {System.out.println("Persembe");}
            else if (rakam==5){System.out.println("cuma");}
            else if (rakam==6) {System.out.println("cumartesi");}
            else if (rakam==7) {System.out.println("pazar");}
            else{System.out.println("gun sayisi gecersiz");*/



// ayni gun numarasini yazsak da kirmizi olmaz ama java ilk olani bulur digerini dikkate almaz
//switch degistirgectiir
                switch (gunNo){
                    case 1:
                        System.out.println("Pazartesi");
                        break;
                    case 2:
                        System.out.println("sali");
                        break;
                    case 3:
                        System.out.println("Carsamba");
                        break;
                    case 4:
                        System.out.println("persembe");
                        break;
                    case 5:
                        System.out.println("cuma");
                        break;
                    case 6:
                        System.out.println("cumartesi");
                        break;
                    case 7:
                        System.out.println("Pazar");
                        break;
                    default:
                        System.out.println("gecersiz gun no");

//break kullanmazsak buldugu degerden sonra olan degerleri de yazdirir.

                }}
        }







/*if teki olasilik fazlasi cok fazlaysa dizayn anlaminda daha duzenli bir kod olusturur.
if else statements ile cozdugumuz sorularda olasi durumlarin sayisi arttikca if else if..
 yapisi kurgulanmasi ve anlasilmasi zor hale gelebilir.
 ornegin kullanicinin rakam olarak girdigi gun nurmasinin ismini yazmamiz icin 8 if else gerekir,
  bu durum sonrasinda kodu inceleyenler icin uzun ve zor olabilir.



 */