public class RandomDice {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder ");
		
        System.out.println("Starting position 0 ");
        
		int startPosition = 0 ;

        // The Player rolls the die to get a number between 1 to 6.

        Random random = new Random();
		
        int dice = random.nextInt(6)+1;
		
        System.out.println("Result = "+dice);
    }

}