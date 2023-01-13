package ders10_stringManipulations;

public class C07_soru {
    public static void main(String[] args) {


        //kullanicidan bir cumle ve bir metin alin cumledeki metnin durumuna gore
        // 1. cumle metni icermiyor
        //2. cumle metni sadece 1 kere iceriyor
        //3. Cumle metni birden fazla iceriyor
        //seceneklerinden uygun olani yazdirin

        String cumle = "java cok guzeldir cok";
        String metin = "cok";

        if (!cumle.contains(metin)) {
            System.out.println("cumle metin icermiyor");
        } else {

            int ilkindex = (cumle.indexOf(metin));//5
            int ikinciindex = cumle.indexOf(metin, ilkindex + 1);
            System.out.println(ilkindex);
            System.out.println(ikinciindex);
            if(ikinciindex==(-1)){
                System.out.println("cumle metni sadece 1 kere iceri");}else{
                System.out.println("cumle metni birden fazla iceriyor");

        }
    }}}
