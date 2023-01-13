package ders11_stringManipulations;

public class C04_replaceAll {
    public static void main(String[] args) {


        //kullanicini giridigi metinde
        //harf disindaki tum karakterleri temizleyin
        //not= space silinmemeli

        String input="Ja5+va cok 1*guzel";


        input=input.replaceAll("\\d","");
        input=input.replace(" ","5");
        input=input.replaceAll("\\W","");
        input=input.replace("_","");
        input=input.replace("5"," ");
        input=input.replaceAll("\\s+"," ");
        System.out.println(input);

    }
}
