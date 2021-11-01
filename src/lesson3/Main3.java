package lesson3;

public class Main3 {
    public static void main(String[] args) {
        double moneyAmount = 100000;
        double rate = 7;
        int years = 9;

        for (int year = 1; year <= years; year++){
            for(int month = 0; month<12;month++){
                moneyAmount = moneyAmount + ((moneyAmount/100*rate)/12);
            }
        }

        System.out.println(moneyAmount);
    }
}
