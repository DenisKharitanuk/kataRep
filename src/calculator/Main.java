package calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);


    private static int[] intArray = new int[3];
    private static char operand;


    public static String consoleInput() {

        String input = in.nextLine();
        in.close();

        return input;

    }


    public static String calc(String input) throws IOException {

        String stringArray[] = input.split(" ");

        if (stringArray.length != 3) {

            throw new ArrayIndexOutOfBoundsException("Неверный формат");

        }

        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringArray[i].trim());

                if (intArray[i] > 11 || intArray[i] < 1) {

                    throw new IOException("Ошибка ввода");


                }

            } catch (NumberFormatException ex) {

                operand = input.charAt(i + 1);

            }


        }

        input = Integer.toString(calculationResult());

        return input;
    }



    private static int calculationResult() throws IOException {
        int result = 0;


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
            default:


                throw new IOException("Ошибка ввода");


        }


        return result;
    }


}
