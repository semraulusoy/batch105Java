package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileOutputStream fos=new FileOutputStream("src/ders36_checkedExceptions/Deneme.txt");


        //Java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        // FileInputStream classindan obje olusturup o obje araciligiyla dosyayi kullanabiliriz

        //fis olustururken ulasmak istedigimiz dosyanin dosya yolunu parametre olarak girmeliyiz
        //deneme dosya yolunu bulmak icin denemenin ustune sag tus tikladik copy path/referance e tikliyoruz
        //Path from contence root u tiklayinca yolu koppyaliyor onu getirip parantezin icine string olarak yaziyoruz.




        //Checked exception olusturma ihtimali olan kodlari yazdigimizda java compile time
        // orada bir ihtimali oldugunu gorur ve kodun altini kirmizi cizer exceptionu handle etmek icin
        //degil kirmizi cizgiyi kaldirmak icin iki yontem vardir
        //1-exceptionu try catch ile handle etmek
        //2-Javaya sorun ihtimalinin farkinda oldugumuzu ama kodumuz givendigimizi ve calismaya devam etmesini
        //istedigimizi soylemek 9aksi durumda javanin exception firlatmasinin onune gecmiyoruz kodu calistirmaya
        //devam et diyoruz bunun icin method signature una method deklarasyonu ile curly braces arasina throws
        //keyword ve beklenen exception turu yazilabilir.
    }
}
