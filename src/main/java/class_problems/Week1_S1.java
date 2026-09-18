import java.util.Random;

public class Week1_S1 {
    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};
    
    
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        Random random = new Random();
        
        int wins = 0, losses = 0, draws = 0;
        
        System.out.printf("%-8s | %-12s | %-13s | %-13s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < playerMoves.length; i++) {
            String player = playerMoves[i];
            String computer = MOVES[random.nextInt(3)];
            String result = playRound(player, computer);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            
            System.out.printf("%-8d | %-12s | %-13s | %-13s%n", (i + 1), player, computer, result);
        }
        
        double winPercentage = ((double) wins / playerMoves.length) * 100;
        System.out.printf("%nFinal Summary: Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", 
                wins, losses, draws, winPercentage);
    }
}