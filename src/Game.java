import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final String[] MOVES = {"rock", "paper", "scissors"};
    private Random random;
    private boolean gameActive;

    public Game() {
        random = new Random();
        gameActive = false;
    }

    public void startNewGame() {
        gameActive = true;
        System.out.println("Game started! You can now make your move.");
    }

    public void terminateGame() {
        gameActive = false;
        System.out.println("Game terminated.");
    }

    public void makeMove(String playerMove) {
        if (!gameActive) {
            System.out.println("No active game. Please start a new game first.");
            return;
        }

        if (!isValidMove(playerMove)) {
            System.out.println("Invalid move. Please choose rock, paper, or scissors.");
            return;
        }

        String computerMove = MOVES[random.nextInt(MOVES.length)];
        String result = determineOutcome(playerMove, computerMove);

        System.out.println("Player chose " + playerMove + ", Computer chose " + computerMove + ". " + result);
    }

    public boolean isActive() {
        return gameActive;
    }

    private boolean isValidMove(String move) {
        for (String validMove : MOVES) {
            if (validMove.equalsIgnoreCase(move)) {
                return true;
            }
        }
        return false;
    }

    private String determineOutcome(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "It's a tie!";
        }

        switch (playerMove.toLowerCase()) {
            case "rock":
                return computerMove.equals("scissors") ? "You win!" : "You lose!";
            case "paper":
                return computerMove.equals("rock") ? "You win!" : "You lose!";
            case "scissors":
                return computerMove.equals("paper") ? "You win!" : "You lose!";
            default:
                return "Invalid move.";
        }
    }
}

