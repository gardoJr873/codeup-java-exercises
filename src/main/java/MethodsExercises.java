import java.util.Scanner;
public class MethodsExercises {
    public static int Addition(int numA, int numB) {
        return numA + numB;
    }
    public static int Subtraction(int numZ, int numX) {
        return numZ - numX;
    }
    public static int Multiplication(int numR, int numE) {
        return numR * numE;
    }
    public static double Division(double numG, double numH) {
        return numG / numH;
    }
    public static double Modulus(double numU, double numI) {
        return numU % numI;
    }

//    public static int inputRange(int min, int max) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userChoice = userInput.nextInt();
//                if (userChoice <= 10) {
//                    System.out.println(userChoice);
//                } else if(userChoice > 10) {
//                    System.out.println("Choose another number");
//                }
//        return inputRange(min, max);
//    }
    public static long factorialNum(long i) {
        if(i <= 1) {
            return i;
        }
        return i * factorialNum(i - 1);
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(Addition(2, 8));
        System.out.println(Subtraction(5, 7));
        System.out.println(Multiplication(9, 4));
        System.out.println(Division(2, 4));
        System.out.println(Modulus(2, 4));
//        System.out.println(inputRange(1, 10));

        System.out.println("Enter a number between 1 and 10 ");
        int factorial = userInput.nextInt();
        System.out.println("The factorial result is: "+ factorialNum(factorial));
    }
}
