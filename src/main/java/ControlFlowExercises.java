import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        do {
            System.out.println("What number would you like to go up to?");
            double numChoice = Integer.parseInt(choice.nextLine());

            System.out.printf("Here is your table!%n number | squared | cubed %n --------- | ---------- | --------%n");

            for (int i = 1; i <= numChoice; i++) {
                System.out.println(i + " \t\t\t   |  " + Math.pow(i, 2) + "\t\t|\t  " + (Math.pow(i, 3)));
            }
                System.out.println("Would you like to go again ");
                String userChoice = String.valueOf(choice.nextLine());

            if(userChoice.equalsIgnoreCase("no")){
                System.out.println("Thank You");
                break;
            }
        } while (true);
        choice.close();
    }

}