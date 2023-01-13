package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);

        //100 gun once tarih neydi

        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.minusWeeks(6).minusDays(3));
    }
}
