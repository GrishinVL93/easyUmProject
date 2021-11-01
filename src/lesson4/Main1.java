package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String password = "Passwor3Deee";

        if(password.length()<8){
            System.out.println("Слишком маленький пароль");
            return;
        }

        if(!password.contains("0") &&
                !password.contains("1") &&
                !password.contains("2")  &&
                !password.contains("3") &&
                !password.contains("4")  &&
                !password.contains("5") &&
                !password.contains("6")  &&
                !password.contains("7") &&
                !password.contains("8")  &&
                !password.contains("9") ){
            System.out.println("В пароле нет цифр");
            return;

        }


        String alphabet = "abcdefghijklmnopqrstuvxyz".toUpperCase();

        for(int i = 0;i < alphabet.length();i++){
            char c = alphabet.charAt(i);

            if(password.contains(c+"")){
                System.out.println("Это большая буква: " + c);
            }
        }
    }
}
