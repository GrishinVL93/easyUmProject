package lesson1;

public class HomeWork3 {
    public static void main(String[] args) {

        double weightBookCase = 4;
        double heightBookCase = 3;
        double lengthBookCase = 8.5;

        double weightBook = 1;
        double heightBook = 0.5;
        double lengthBook = 3;

        /**
         * Расчет объема книжной тумбочки и одной книги
         */
        double volumeBookCase = weightBookCase * heightBookCase * lengthBookCase;

        double volumeBook = weightBook * heightBook * lengthBook;

        /**
         * Расчет количества помещаемых книг в тумбочке
         */
        int countBookInCase = (int) (volumeBookCase / volumeBook);

        System.out.println(countBookInCase);

        System.out.println(Character.isJavaIdentifierPart(53));
        System.out.println((char)53);

    }
}
