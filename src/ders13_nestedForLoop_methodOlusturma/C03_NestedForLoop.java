package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        //1-4 arasi sayilar icin carpim tablosu olusturalim
        //dis dongu satirlari kontrol eder
        //ic dongu satirda olan degerleri kontrol eder


        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.print(i * j + " ");
                //ic dongu bittiginde javayi alt satira indirmemiz icin bos hiclik yazdirmamiz gerekir
                // .dikkat!!!! dongunun disina suslu parantezden sonra uani ic loop isini bitirince
            }
                System.out.println("");



            }

        }


    }












/*for loop biizim icin bir islemi belirli sayida
yaoan kod blogudur bazen bir islem yeterli olmaz carpim tablosu gibi lig fixturu gibi
 nested for loop iki sekilde karsimiz cikar




 */