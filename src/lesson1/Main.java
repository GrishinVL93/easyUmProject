package lesson1;

public class Main {
    public static void main(String[] args) {
        double lengthRoom = 3;
        double weightRoom = 4.5;
        double weightTable = 1.2;
        double lengthTable = 2;

        double SRoom = lengthRoom*weightRoom;
        double STable = weightTable*lengthTable;

        System.out.println(SRoom);
        System.out.println(STable);

        System.out.println((int)(SRoom/STable));
    }
}
