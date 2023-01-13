package ders25_staticKeyword;
    public class AHemsire {

        static String hastaneIsmi="Yildiz Hastanesi";
        static String hastaneAdresi="Cankaya / Ankara";
        static String bashekimIsmi="Dr Mehmet Yilmaz";

        //herkes icin ortak oldugundan static olarak isaretlenir.

        String personelIsim="Isim belirtilmedi";
        String personelAdresi="Adres belirtilmedi";
        String personelTelefon="Telefon belirtilmedi";
//bu ustteki uc tanesi instance variable dirlar
//null olmasindan sa ...belirtilmedi demek daha iyidir.


        @Override
        public String toString() {
            return "AHemsire{" +
                    "personelIsim='" + personelIsim + '\'' +
                    ", personelAdresi='" + personelAdresi + '\'' +
                    ", personelTelefon='" + personelTelefon + '\'' +
                    ", \nhastane ismi='" + hastaneIsmi + '\'' +
                    ", hastane adresi='" + hastaneAdresi + '\'' +
                    ", bashekim ismi='" + bashekimIsmi + '\'' +
                    '}';
        }



//burada parametresiz constructor yoktur o yuzden default constructor calisir
    }

