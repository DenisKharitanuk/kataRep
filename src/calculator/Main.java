package calculator;

import java.util.Scanner;

public class Main {
    private static Scanner in;


    private static int[] intArray;
    private static char operand;


    public Main() {

        in = new Scanner(System.in);

        intArray = new int[3];

    }

    public String consoleInput() {
        String input = in.nextLine();
        in.close();
        return input;
    }


    public static String calc(String input) {

        String stringArray[] = input.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringArray[i].trim());
            } catch (NumberFormatException ex) {
                operand = input.charAt(i+1);
            }
        }


        input = Integer.toString(calculationResult());

        return input;
    }

    public static int calculationResult() {
        int result = 0;
        double doubleResult=0;

        try {


            switch (operand) {
                case '+':
                    result = intArray[0] + intArray[2];
                    break;
                case '-':
                    result = intArray[0] - intArray[2];
                    break;
                case '*':
                    result = intArray[0] * intArray[2];
                    break;
                case '/':
                    result = intArray[0] / intArray[2];
                    break;

            }
        }
        catch (ArithmeticException ex){
            result = 0 ;
        }

        return result;
    }


}
