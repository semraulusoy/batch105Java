package ders32_inheritenceConstructorcall;

public class DCamry extends BToyota {


    DCamry(String pc) {
        super("Deniz");
        System.out.println("String parametreli Camry");
//eger kullenilen argumente uygun bir constructor parent classta yoksa
        //direk CTE verir
    }
    DCamry(){

    }

    public static void main(String[] args) {
        // Eger kullanilan argumente uygun bir constructor
        // parent class'da yoksa CTE olur
        DCamry camry2 = new DCamry("celal");
        // Parametreli Araba constructor
        //String parametreli Toyota constructor
        //String parametreli Camry


        System.out.println("=======");
        DCamry camry1 = new DCamry();
        // Parametresiz Araba constructor
        //Parametresiz Toyota Constructor

    }

    }


