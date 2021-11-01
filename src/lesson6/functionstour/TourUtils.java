package lesson6.functionstour;

public class TourUtils {

    public static void printToursByCountry(String country, String[][] tours){

        for(int i  =0;i<tours.length;i++){
            if(country.equals(tours[i][0])){
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s\n",tours[i][0],tours[i][1],
                        tours[i][2],tours[i][3],tours[i][4],tours[i][5]);
            }
        }
    }

    public static void printToursByDayCount(String[][] tours, String days){
        int a = Integer.parseInt(days);

        for(int  i = 0;i<tours.length;i++){
            int daysCurrentTrip = Integer.parseInt(tours[i][1]);
            if(daysCurrentTrip <= (a+2) && daysCurrentTrip >= (a-2)){
                System.out.printf("%s, %s дней, %s руб., %s, %s, %s\n",tours[i][0],tours[i][1],
                        tours[i][2],tours[i][3],tours[i][4],tours[i][5]);
            }
        }

    }

    public static int averageCostTourByCountry(String[][] tours, String country){
        int costAllTripsByCountry=0;
        int countTripByCountry=0;
        for(int i = 0;i< tours.length;i++){
            if(country.equals(tours[i][0])){
                costAllTripsByCountry+= Integer.parseInt(tours[i][2]);
                countTripByCountry++;
            }
        }
        return costAllTripsByCountry/countTripByCountry;
    }
}
