package util;

import java.util.Scanner;

public class Input {

    public String scanner;

    public static void setString(String scanner) {
        System.out.println(scanner.equalsIgnoreCase(""));
    }

    //The yesNo method should return true if the user enters y, yes, or variants
// thereof, and false otherwise.
    public boolean yesNo(boolean input) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNoInput = scanner.nextBoolean();


        if (yesNoInput) {
            System.out.println("bye bye");
        } else {
            System.out.println("go again");
        }
        return input;
    }

//    The getInt(int min, int max) method should keep prompting the user for input
//    until they give an integer within the min and max. The getDouble method should
//    do the same thing, but with decimal numbers.

    String setInt(int minInt, int maxInt) {

        do {
            System.out.println("Enter number or -1 to stop");
            int num = Integer.parseInt(scanner);

            if (num == -1)
                break;
            if (num > minInt) {
                minInt = num;
            }
            if (num < maxInt) {
                maxInt = num;
            }
        } while (yesNo(true));
        return scanner;
    }

    int getInt() {
        return setInt();
    }

    private int setInt() {
        return 0;
    }

    public String getDouble(double MAX_VALUE_DB, double MIN_VALUE_DB) {

        do {
            System.out.println("Enter number or -1 to stop");
            double num = Double.parseDouble(scanner);

            if (num == -1)
                break;
            if (num < MIN_VALUE_DB) {
                System.out.println("The Minimum number is " + num);

            }
            if (num > MAX_VALUE_DB) {
                System.out.println("The Maximum number is " + num);
            }
        } while (yesNo(true));
        return scanner;
    }

    double setDouble(double scannerDouble) {
        return scannerDouble;
    }

    static class InputTest {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Input userInput = new Input();

            System.out.println(userInput.scanner);

            System.out.println(userInput.getDouble(9, 2));
            System.out.println(userInput.getInt());

            System.out.println(userInput.yesNo(true));
            System.out.println(userInput.scanner);
        }

    }



}