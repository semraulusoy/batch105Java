package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr1={2,4,6,8,10};
        //arrayin bir elementine ulasmak ve update etmek istersek
        System.out.println(arr1[2]);//6
        arr1[3]=20;
        System.out.println(arr1[3]);//20

        System.out.println(arr1.length);//5

        //son elementi yazdirin

        System.out.println(arr1[arr1.length-1]);//10

        //arrayin tum elementlerini yazdirin

        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+" ");

            //arrayin uzunlugu sonradan degistirilemez
            //agar arrayde olmayan bir index e atama yapmak isterseniz
            //arrayindexoutofBoundsexception dur cte degildir yazdirdigimizda yanlis olmadigini anlamadi

              //arr1[5]=35;



        }



    }

}
/*bugune kadar kullandigimiz data turleri sadece bir variable a 1 deger atamasi yapabiliyordu.
ancak java gibi komplex uygulamalar gelistirilmeye uygun bir programlama dilinde
birden fazla eleman barindirabilen yapilara ihtiyac vardir.


arrayler yani diziler ayni data turunden birden fazla eleman barindiran objelerdir.obje nonprimitive data turudur.
array nonprimitive data turudur her array bir objedir.

arrayler her bir eleman icin ayri bir alan ayirirlar ve bu elemana index bilgisi ile ulasabiliriz.

1-bir array olusturulurken 2 sey deklare edilmek zorundadir.
a.icine konulacak elementlerin data turu int[] arr= new int[5]
int yazarak anlasilmaz koseli parantez array oldugunu anlar
b. icine kac element konulacagi(length)
olusturulan arrayin uzunlugu sabittir, degistirilmez.

bir array icinde farkli data turunden elementler olamaz.

siz string bir array olusturdugunuzda  String[] str={"A","B"} referansi koydugu icin sigar.
primitive data turlerinin degeri nonprimitive datalarin ise referanslarini barindirirlar.

bir array iki sekilde deklare edilir

int arr[];

int[] arr;

deklare ettik ama deger atamadik java referansi olusturur ama length belli olmadigindan objeyi olusturmaz.




bir arraye iki sekilde deger atanabilir.

direk deger atanabilir

int[]arr={1,3,8,23,99} Java boyle yazar [1 ,3 ,8 ,23 ,99]

uzunlugu belirtilerek olusturulur ama elemanlara deger atamasi yapilmaz.
bu durumda default deger atamasi yapar.bu durumda Java belirtilen uzunlukta
ve default degerlere sahip bir array olusturur.


int[]arr=new int[5];       [0 ,0 ,0 ,0 ,0]

bir arrayin length ini

int[]arr={1, 3, 8, 23, 99}
System.out.println(arr.length);//5

arraydeki length bir method degil uzunlugu tutan bir variabledir. dolayisiyla yaninda () yoktur.








 */



