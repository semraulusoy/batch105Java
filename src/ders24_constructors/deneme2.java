package ders24_constructors;

public class deneme2 {
    String isim= "John Doe";
    int yas=40;




    public deneme2() {
        isim="Seher";
        System.out.println("isim : "+isim);


    }
    public deneme2(String isim) {
        this();
        this.yas=30;
        System.out.println("isim : "+ isim);

}

    public deneme2(String isim, int yas) {
        this("Murat");
        this.yas = 45;
    }

    public static void main(String[] args) {
        deneme2 obj1=new deneme2("Esra");
        deneme2 obj2=new deneme2("fatih",35);
    }
}

