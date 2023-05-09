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


    public static String calc(String input) {

        String stringArray[] = input.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringArray[i].trim());

                if (intArray[i] > 10 || intArray[i] < 1) {
                    try {
                        throw new IOException();

                    } catch (IOException ex) {
                        System.out.println(" Ошибка ввода ");
                        System.exit(1);
                    }

                }

            } catch (NumberFormatException ex) {

                operand = input.charAt(i + 1);

            }


        }

        input = Integer.toString(calculationResult());

        return input;
    }

    private static int calculationResult() {
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

                try {
                    throw new IOException();

                } catch (IOException ex) {
                    System.out.println("Ошибка ввода");
                    System.exit(1);
                }

        }


        return result;
    }



}
