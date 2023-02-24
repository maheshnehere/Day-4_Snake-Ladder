public class PlayersTwo {
    public static void main(String[] args) {
        int P1Position = 0;
        int P2Position = 0;

        Random random = new Random();

        while (P1Position < 100) {

            int dice = random.nextInt(6) + 1;
            int dice1 = random.nextInt(6) + 1;
            int step = random.nextInt(3);


            switch (step) {
                case 0:
                    System.out.println("No play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    P1Position = P1Position + dice;
                    P2Position = P2Position + dice1;
                    if (step == 1) {
                        P1Position = P1Position + dice;
                        P2Position = P2Position + dice;
                    }
                    if (P1Position > 100) {
                        P1Position = 100;
                    }
                    if (P2Position > 100) {
                        P2Position = 100;
                    }

                    break;
                default:
                    System.out.println("snake");
                    P1Position = P1Position - dice;
                    P2Position = P2Position - dice1;
                    if (P1Position < 0) {
                        P1Position = 0;
                    }
                    if (P2Position < 0) {
                        P2Position = 0;

                    }
                    break;
            }


            System.out.println("Player 1 position = " + P1Position);
            System.out.println("player 2 position = " + P2Position);

            if(P1Position > P2Position) {
                System.out.println("Player 1 is Winner");
            }else if (P2Position > P1Position) {
                System.out.println("Player 2 is Winner");
            }else{
                System.out.println("Both player score are equal");
            }
        }
    }
}
