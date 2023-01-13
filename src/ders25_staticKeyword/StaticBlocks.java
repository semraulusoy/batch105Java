package ders25_staticKeyword;

public class StaticBlocks {
    static{
        System.out.println("2.block calisti");
    }

    static {
        System.out.println("1.blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }
}
//statik bloklar main metoddan once calisir eger bir class calistiginda
// biryerlerden bilgi alacaksaniz main metoddan once calismasini isterniz static block calisir

//statik bloklar uste hangisi yazilmissa once o calisir main methoddan once ya sonra calismasi onemli degildir once statik blok calisir