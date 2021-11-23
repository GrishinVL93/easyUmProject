package lesson18.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImpl implements StringUtils {


    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        double result = 0;
        try {
             if (number1 == null || number2 == null)
                 throw new NullPointerException("number1 or number2 = null");

             if(Double.parseDouble(number2) == 0){
                 throw new ArithmeticException("number2 = 0");
             }

             result = Double.parseDouble(number1)/Double.parseDouble(number2);

        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }
        catch (NumberFormatException numberFormatException){
            numberFormatException.printStackTrace();
        }
        catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        Matcher matcher = Pattern.compile(word).matcher(text);
        List<Integer> listOfIndexes = new ArrayList<>();
        List<String> words = new ArrayList<>();
        while(matcher.find()){
            listOfIndexes.add(matcher.start());
        }

        int[] arrOfIndexes = new int[listOfIndexes.size()];
        int i = 0;
        for(Integer e: listOfIndexes){
            arrOfIndexes[i++] = e;
        }

        return  arrOfIndexes;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        Matcher matcher = Pattern.compile("(\\d+.?\\d+)").matcher(text);
        List<Double> doubleList = new ArrayList<>();
        while (matcher.find()){
            doubleList.add((Double.parseDouble(matcher.group())));
        }
        if(doubleList.size() == 0){
            throw new CustomException("Not found");
        }

        double[] arrDoubles = new double[doubleList.size()];
        int i = 0;
        for(Double d: doubleList){
            arrDoubles[i++] = d;
        }

        return arrDoubles;
    }
}
