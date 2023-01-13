package ders26_PassByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;
        System.out.println(fiyat);//100
        System.out.println(indirimUygula(fiyat));//90

       fiyat=indirimUygula((fiyat));//atamasini yapariz

    }

    //kodlarimizin anlasilir olmasi icin main methhod dan diger methodlara parametre olarak
    // gonderdigimiz variablelar icin ayni ismi variable olusturmayi tercih ederiz
    public static double indirimUygula(double fiyat){
        //%10 indirim yapsin

        fiyat=fiyat*0.9;//fiyata atama yaptik kalici olarak 90 oldu
        return fiyat;


        //value uzerinden islem yaptigi icin methodlar arasi gecis yaparken variable i degil variablein value sunu gecirir.
        //bu Javanin PassbyValue yu tercih etmesinden kaynaklanir.eger indirimin kalici olmasini istersek
        // main methodun icerisinde atama yaparsak kalici olur

        //   pass By Value ve Pass by referance yazilim dilini tasarlayanlarin verdigi ya da verecegi karardir.
        //   mesela benim kirmizi arabam var acaba benim arabam sari olsa nasil olurdu dersem arabami sariya mi boyarim
        //     yoksa bir simulasyonla bakar ona gore karar veririm . methodda bor sey deniyoruz eger onun kalici olmasini istersen
        //     bakarim sonra atarim

        //METHODDA YAPILAN DEGISIKLIK METHODDA KALIR BIZIM MAIN METHODUMUZDA DEGIL

        //programlama dilleri bir variable methoddan kullanilacaksa
        // asil variable in degerinin degisipn degismeyecegine karar vermelidir.
        // Eger methodda yapilan degisiklik asil variable in degerini degistirmiyorsa buna pass by value
        // degistiriyorsa buna passby referance denir .objenin referansini methoda gecirince
        // o obje uzerinde ypilan degisiklikler kalici olur .
        //Java bu iki ihtimalden passby Value yu tercih eder.herhangi bir methodda olusturulan bir variable
        // baska methoda parametre olarak gonderilecegi zaman asil variable degil asil variable in degerine sahip
        // kopya bir variable gonderilir. Boylece kopya variable uzerinde yapilan degisiklikler asil variable i etkilemez.
        //Eger methodda yapilan degisikligin asil variablein degerini de degistirmesini istersek
        // methoddan yeno degeri dondurup asil variable a atama yapabiliriz.(methodda yapilan degisikligi deger olarak
        // main method yollariz mani methodda eski asil variableimiza atama yapariz kalici olur.
        //birden fazla element barindiran Array ve arrayList gibi objelerde de passbyValue gecerlidir.
        //coklu element barindiran objelerde elementin degistirilmesi passbyvalue yu etkilemediginden
        // element degisiklikleri kalici olur.ancak Array veya arrayListte methodda yapilan yeni deger atamasi
        // passbyValue kurallari cercevesinde kalici olmaz sadece yapildigi method icin gecerli bir atama olur.
        // main methoda donuldugunde asil objenin degeri degismemis olur.
    }
}
