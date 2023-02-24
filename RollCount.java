public class RollCount {
    public static void main(String[] args) {
      
        int Location = 0 ;
		
        int diceCount = 0 ;

        // The Player rolls the die to get a number between 1 to 6.
        while (Location < 100) {
            Random random = new Random();
            int dice = random.nextInt(6) + 1;
            System.out.println("Dice Number is = " + dice);
            diceCount++;
            System.out.println("Location of Die ="+diceCount);

            // The Player then checks for Option. They are No Play,Ladder or Snake.

            int num = random.nextInt(3);

            switch (num) {
                case 0:
                    System.out.println("Ladder");
                    Location += dice;
                    break;
                case 1:
                    System.out.println("Snake");
                    Location -= dice;
                    if (Location < 0) {
                        Location = 0;
                    }
                    break;

                default:
                    System.out.println("No Play");
            }
            if(Location > 100){
                Location -= dice;
            }
        }

        System.out.println("Player Location is = "+Location);
        System.out.println("Numbers of Times Dice was Played = "+diceCount);
    }
}