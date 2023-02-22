import java.util.*;
import java.io.*;

public class Bob {
    public static void main(String[] args) {

        Scanner userTalk = new Scanner(System.in);

        boolean userChoice = true;
        do {

            userTalk.nextLine();

            if () {
                System.out.println("Sure");
            } else if (userTalk.hasNext("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userTalk.hasNext("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        } while (userChoice);

    }
}
