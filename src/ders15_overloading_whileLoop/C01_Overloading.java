package ders15_overloading_whileLoop;

public class C01_Overloading {
    public static void main(String[] args) {

        String str="Java ogredik siradaki gelsin ";
        System.out.println(str.startsWith("a",3));

    }
}
//bir class da ayni isimde fakat farkli method signatureina sahip metodlarin bulunmasidir
//iki tane substring 3 tane toUpperCase gibi

//bir classta birden fazla method olusturmak istersek signature larini degistirmek lazimdir

//method signature: method ismi,parametre sayisi ve parametrelerin dizilisi demektir
