package ders18_arrays;

public class C08_soruCozumu {

   // Soru 7 : String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
   // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

    public static void main(String[] args) {
        String[]arr={"Kemal","Jonathan","Mark","Angie","Veli"};

        String enKisaKelime=arr[0];
        String enUzunKelime=arr[0];

        for (int i = 1; i < arr.length; i++) {
           if (arr[i].length()<enKisaKelime.length()){
               enKisaKelime=arr[i];
           }
           if (arr[i].length()>enUzunKelime.length()){
               enUzunKelime=arr[i];
           }
        }
            System.out.println("En kisa kelime : "+enKisaKelime);
            System.out.println("En Uzun Kelime : "+ enUzunKelime);

    }

}
