package lesson6.functionstour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] tours = {
                {"Италия","7","400000","Самолет","5звезд","Полупансионат"},
                {"Италия","4","100000","Автобус","4звезды","Пансионат"},
                {"Египет","5","60000","Самолет","3звезды","Полупансионат"},
                {"Кипр","7","50000","Самолет","5звезд","Пансионат"},
                {"Турция","10","100000","Самолет","5звезд","Пансионат"}
        };


        Scanner sc=  new Scanner(System.in);
       /* System.out.println("В какую страну вы хотите поехать?");

        String country = sc.nextLine();

        TourUtils.printToursByCountry(country,tours);*/

        //2
        /*System.out.println("На сколько дней хотите поехать?");
        String days = sc.nextLine();
        TourUtils.printToursByDayCount(tours,"5");*/

        //3
        System.out.println("В какую страну хотите поехать?");
        String country = sc.nextLine();
        System.out.println(TourUtils.averageCostTourByCountry(tours,country));
    }
}
