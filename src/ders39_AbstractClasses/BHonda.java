package ders39_AbstractClasses;

public abstract class BHonda extends Araba {
    //Abstract bir classi parent edindigimizde iki alternatifimiz olur.
    //1-Parentimiz olan abstract classtaki methodlari override etmek
    //2-Proje yapimiz gerektiriyorsa bu classi da abstract yapmak

    public void marka(){
        System.out.println("marka:Honda");}

    public abstract void yakit();
    public abstract void guvenlik();
    public void ozelTeknoloji(){
        System.out.println("Tum Honda arabalar vtech teknolojisi kullanir");
    }

}
