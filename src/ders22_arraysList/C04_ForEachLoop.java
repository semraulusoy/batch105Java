package ders22_arraysList;

public class C04_ForEachLoop {
    public static void main(String[] args) {

        int[]arr={3,5,7,8,4,2,6,9,4,5};

        //bu Arraydeki 5 ten buyuk  elementleri toplayalim
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>5){
           }
            toplam+=arr[i];

        }
        System.out.println("for loop ile :"+toplam);//53

        //bunu for-each loop daha basit bir kurgu ile calisir.
        //for-each loopa uc seyi soylemek zorundasiniz
        //1-hangi data turundeki degiskenlerle ugrasacaksiniz
        //2-loopun icerisinde herbir eleman geldiginde hangi isimle islem yaoacaksiniz.
        //3-hangi Array veya collection dan elemanlar gelecek
toplam=0;

        for (int each:arr    //arrye git herbir int bana getir.
             ) {
            if(each>5){
                toplam+=each;
            }
            System.out.println("for-each loop ile" + toplam);}

            //dezavataji index yapisi olmadiginidan bastan sona yada sondan basa getir diyemeyiz
        }



    }


//For-Each Loop(enhanced)gelismis Loop olarak bilinir
// ve bir array veya collectiondaki tum elementleri
// index veya siralama olmaksizin bize getirir.