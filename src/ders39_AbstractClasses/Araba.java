package ders39_AbstractClasses;

public abstract class Araba {

    //Araba classini inherit eden tum classlar motor kasa ve tekerlek
    // methodlarini override etmek zorunda kalsin
    //ancak abs,klima methodlari opsiyonel olsun isteyen override etsin isteyen etmesin
    public abstract void marka();
    public abstract void motor();
    public abstract void kasa();
    public abstract void tekerlek();

    public void abs (){
        System.out.println("Guvenlik artirmak isteyen arabalar abs kullanmak zorunda ");
    }
    public void klima(){
        System.out.println("Konfor artirmak isteyen arabalar klima kullanmali");
    }
}
