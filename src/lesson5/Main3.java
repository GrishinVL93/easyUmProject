package lesson5;

public class Main3 {
    public static void main(String[] args) {

        boolean[][] schedule = new boolean[7][7];

        FunctionSchedule.reserve(schedule,"Пн", 0);

        FunctionSchedule.reserve(schedule, "Вт", 3);
        FunctionSchedule.reserve(schedule,"Ср",1);
        FunctionSchedule.reserve(schedule,"Чт",3);

        System.out.print("         Пн      Вт      Ср      Чт      Пт       Сб         Вс   \n");
        for(int i = 0;i<schedule.length;i++){
            System.out.print((i+9) + " - " + (i+10) + " ");
            for(int j = 0; j<schedule[i].length;j++){
                if(schedule[i][j]){
                    System.out.print("занято ");
                }
                else {
                    System.out.print("свободно ");
                }
            }
            System.out.println();
        }

        /**
         * Формула написания методов(функций)
         * 1 - модификатор доступа(public,default,protected,private)
         * 2 - static(или отсутствие) принадлежит объекту или нет(классу)
         * 3 - возвращаемый тип void или тип возвращаемого объекта
         * 4 - имя(понятное)
         */

    }
}
