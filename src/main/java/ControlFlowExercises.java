import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner gradeInput = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        do {
            System.out.println("Enter numeric grade");
            double grade = gradeInput.nextDouble();

            if(grade >= 88) {
                System.out.println("You scored an A");
            } else if (grade >= 80) {
                System.out.println("You scored a B");
            } else if (grade >= 67) {
                System.out.println("You scored a C");
            } else if (grade >= 60) {
                System.out.println("You scored a D");
            } else if (grade >= 59){
                System.out.println("You scored an F");
            } else if ( grade >= 0) {
                System.out.println("You scored an F");
            }

            System.out.println("continue");
            String userChoice = choice.nextLine();

            if(userChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank You");
                break;
            }
        } while (true);
    }
}