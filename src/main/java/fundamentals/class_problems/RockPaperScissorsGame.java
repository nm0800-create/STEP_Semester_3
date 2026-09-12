package fundamentals.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    
    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};
    
    public String playRound(String playerMove, String computerMove) {
        playerMove = playerMove.toLowerCase();
        computerMove = computerMove.toLowerCase();
        
        if (playerMove.equals(computerMove)) {
            return "Draw";
        }
        
        if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
            (playerMove.equals("paper") && computerMove.equals("rock")) ||
            (playerMove.equals("scissors") && computerMove.equals("paper"))) {
            return "Player Wins";
        }
        
        return "Computer Wins";
    }
    
    public void playGame(int rounds) {
        Random rand = new Random();
        int wins = 0;
        int losses = 0;
        int draws = 0;
        
        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        
        System.out.println("=== Rock-Paper-Scissors Game ===\n");
        
        // Play N rounds
        for (int i = 0; i < rounds; i++) {
            String computerMove = MOVES[rand.nextInt(3)];
            // For demo, using predefined moves; in real app, accept player input
            String playerMove = getPlayerMove(i + 1);
            
            String result = playRound(playerMove, computerMove);
            
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;
            
            System.out.printf("Round %d — Player: %s, Computer: %s → %s%n", 
                            i + 1, playerMove, computerMove, result);
            
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }
        
        // Print summary table
        System.out.println("\n=== Final Summary ===");
        System.out.println("Round | Player Move | Computer Move | Result");
        System.out.println("------|-------------|---------------|----------");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("  %d   | %11s | %13s | %s%n", 
                            i + 1, playerMoves[i], computerMoves[i], results[i]);
        }
        
        double winPercentage = (wins / (double) rounds) * 100;
        System.out.printf("%nWins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", 
                         wins, losses, draws, winPercentage);
    }
    
    private String getPlayerMove(int round) {
        // Predefined moves for demo (in real app, use Scanner for input)
        String[] demoMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        return demoMoves[round - 1];
    }
    
    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        game.playGame(5);
    }
}
