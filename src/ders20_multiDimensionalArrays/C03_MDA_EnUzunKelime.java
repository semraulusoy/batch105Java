package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {


        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz

        String [][] arr= {{"Ilker","Nesrin"} ,{"Hasan","Heysem","Adem","Yusuf Enes"}};
        String enUzunKelime=arr[0][0];


        for (int i = 0; i <arr.length ; i++) {  //outer arrayin elemanlarini kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {


               // arr[i][j];

                //bunu yazdirisaniz butun elemanlarini yazdirmis olursunuz



              if (arr[i][j].length()>enUzunKelime.length()){
                  enUzunKelime=arr[i][j];
            }

            }
            System.out.println("en uzun kelime: "+ enUzunKelime);
        }


    }
}
