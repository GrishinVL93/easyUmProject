package lesson5.homework;

public class StringMethods {

    //1 Функция печати строки в обратном порядке
    public static void printReverse(String text) {

        char[] charArray = text.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    //2 Функция по подсчету кол-ва глассных в строке

    public static int countVovelLetters(String text) {

        int countRussianVovels = 0;
        int countEnglishVovels = 0;

        char[] wordArray = text.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == 'a' || wordArray[i] == 'A' ||
                    wordArray[i] == 'o' || wordArray[i] == 'O' ||
                    wordArray[i] == 'e' || wordArray[i] == 'E' ||
                    wordArray[i] == 'i' || wordArray[i] == 'I' ||
                    wordArray[i] == 'y' || wordArray[i] == 'Y' ||
                    wordArray[i] == 'u' || wordArray[i] == 'U') {
                countEnglishVovels = countEnglishVovels + 1;
            } else if (wordArray[i] == 'а' || wordArray[i] == 'А' ||
                    wordArray[i] == 'о' || wordArray[i] == 'О' ||
                    wordArray[i] == 'е' || wordArray[i] == 'Е' ||
                    wordArray[i] == 'и' || wordArray[i] == 'И' ||
                    wordArray[i] == 'у' || wordArray[i] == 'У' ||
                    wordArray[i] == 'ы' || wordArray[i] == 'Ы' ||
                    wordArray[i] == 'э' || wordArray[i] == 'Э' ||
                    wordArray[i] == 'я' || wordArray[i] == 'Я' ||
                    wordArray[i] == 'ё' || wordArray[i] == 'Ё' ||
                    wordArray[i] == 'ю' || wordArray[i] == 'Ю') {
                countRussianVovels = countRussianVovels + 1;
            }
        }

        return countEnglishVovels + countRussianVovels;
    }


    //3 Функция по печати каждого слова из входящей строки

    public static void printByWord(String text){
        String[] strArray = text.split(" ");

        for(String s: strArray){
            System.out.println(s);
        }
    }

    //4 Функция возвращаемая среднее значение по двумерному массиву

    public static int countAverage(int[][] nums){
        int sum = 0;
        int countOfElements = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                sum+=nums[i][j];
                countOfElements++;
            }
        }
        return sum/countOfElements;
    }
}