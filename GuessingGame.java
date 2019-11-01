public class GuessingGame {

    public static void main(String[] args) {
        int lowest = Integer.parseInt(args[0]);
        int highest = Integer.parseInt(args[1]);        
        
         Guesser g1 = new Guesser(lowest, highest);
         g1.start();
    }

}


