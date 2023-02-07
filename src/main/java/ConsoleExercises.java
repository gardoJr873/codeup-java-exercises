import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately" + " %f", pi);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of your choice:  ");
        Number userInput = scanner.nextInt();
        //if input is not a number exception thread is thrown indicating InputMismatchException

        System.out.print("You entered: " + userInput);


        System.out.print("Enter three words of your choice:  ");
        String word1 = scanner.nextLine();
        String word2 = scanner.next();
        String word3 = scanner.next();

        System.out.println("You entered: \n " + word1 + " \n " + word2 + "\n " + word3);

//        any extra words can not be inputted due to constraint three input methods
//        the program continues to run till third input is typed

        System.out.print("Let's see what the perimeter of your living space is, let's start by entering the length:"  );
        String lengthX = scanner.nextLine();

        System.out.println("Now let's get the width:"  );
        String widthY = scanner.nextLine();


        System.out.println();

    }
}

