package ders24_constructors;
//bu kod konsolda ne yazdirir.

public class KodOkuma {
    String isim="John Doe";
    int yas=40;

    public KodOkuma(String isim,int yas){
        this.isim=isim;
        this.yas=30;

    }
    public  static void main(String[] args) {

        KodOkuma obj=new KodOkuma("fatih",35);
        System.out.println("isim : "+ obj.isim+
                "\nyas : "+ obj.yas);
    }
}

//ilk olarak main methoddan baslariz sonra iki variableli cons var ona bakar 13 ten baslarriz15. satira bakar
// 8. satira cikar ucuncu adim olarak standart constructorda isim fatih yas 35 olur
// 9.satirda this.isim=isim dediginden atanmis olan Fatih kalir
//10.satirda this.yas=30 yeni bir atama oldugundan 35 gider 30 olur
// 11.scoop sonu kaldigi yere geri doner 2 den sonraya yani 16.satira yazdir demis isim : Fatih Yas : 30 yazdirir.