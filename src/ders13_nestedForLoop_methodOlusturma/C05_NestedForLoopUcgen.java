package ders13_nestedForLoop_methodOlusturma;

public class C05_NestedForLoopUcgen {


    public static void main(String[] args) {





  /*  nested for
    loop kullanarak asagidaki sekli hazirlayin

                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5     dis loop satir sayisini bildirir
                */
        //satiri kontrol eden outer loop taki i dir dis loop i 1 oldugunda birinci sira i bir kere calisir
        //dis loop iki oldugunda iki ye kadar calisir
        //ic loopun bitis noktasi i dis loopun degiskeni

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");


            }
            System.out.println("");
        }


}}