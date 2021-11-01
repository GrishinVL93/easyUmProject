package lesson3;

public class Main7 {
    public static void main(String[] args) {

        String text = "Champion";

        char[] mass = text.toCharArray();

        for(int i = 0; i< mass.length;i++){
            if(mass[i] == 'a' ||
                    mass[i] == 'o' ||
                    mass[i] == 'e' ||
                    mass[i] == 'i' ||
                    mass[i] == 'y' ||
                    mass[i] == 'u')
            System.out.println(mass[i]);
        }
    }
}
