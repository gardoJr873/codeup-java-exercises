public class ControlFlowExercises {
    public static void main(String[] args) {
        int count = 2;
        do{
            System.out.println("Count squared is equal to " + count);
            count *= 2 ;
        } while (count < 1000000);
    }
}
