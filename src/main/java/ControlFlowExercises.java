public class ControlFlowExercises {
    public static void main(String[] args) {
        int count = 100;
        do{
            System.out.println("Count is equal to " + count);
            count-=5;
        } while (count > -15);
    }
}
