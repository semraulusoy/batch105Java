package ders24_constructors;



public class Rope {

public static void swing(){
    System.out.println("swing");
}
public void climb(){
    System.out.println("climb");
}
public static void play() {
    swing();
   // climb();}Statik olan bir methoddan statik olmayan cagrilmaz o yuzden climbi kabul etmedi
    //System.out.println(String[] args);
//one cte verir.one nulllpointer exp verir


    Rope rope=new Rope();
    rope.play();
   // Rope.rope2=null;
   // rope2.play();

}


}

