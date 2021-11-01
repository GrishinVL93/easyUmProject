package lesson5;

public class FunctionSchedule {
    public static void reserve(boolean[][] scheduled, String day, int time){
        int dayIndex = -1;

        if(day.equals("Пн")){
            dayIndex = 0;
        }
        else if(day.equals("Вт")){
            dayIndex = 1;
        }
        else if(day.equals("Ср")){
            dayIndex = 2;
        }
        else if(day.equals("Чт")){
            dayIndex = 3;
        }
        else if(day.equals("Пт")){
            dayIndex = 4;
        }
        else if(day.equals("Сб")){
            dayIndex = 5;
        }
        else if(day.equals("Вс")){
            dayIndex = 6;
        }

        if(scheduled[time][dayIndex] == true){
            System.out.println("Время бронирования - Занято");
        }
        else {
            scheduled[time][dayIndex] = true;
            System.out.println("Время успешно забронировано");
        }

    }
}
