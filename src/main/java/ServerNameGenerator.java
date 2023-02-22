import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"clever", "little", "quite", "nicer", "aggressive", "lazy", "quite", "beautiful", "large", "meaningless"};
        String[] nouns = {"house", "afternoon", "word", "relief", "doctor", "coffee", "goat", "stool", "lake", "bird"};

        Random randomness = new Random();
        int randomWord = randomness.nextInt(adjectives.length);
        int randomWord2 = randomness.nextInt(nouns.length);
        System.out.println("Here is your server name: ");
        System.out.println(adjectives[randomWord] +"-"+ nouns[randomWord2]);

    }
}
