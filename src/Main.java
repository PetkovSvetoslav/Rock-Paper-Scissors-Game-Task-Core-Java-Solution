import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a command: start, move, terminate, or exit.");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "start":
                    game.startNewGame();
                    break;

                case "move":
                    if (!game.isActive()) {
                        System.out.println("You need to start a game first!");
                        break;
                    }
                    System.out.println("Enter your move (rock, paper, or scissors):");
                    String playerMove = scanner.nextLine().trim().toLowerCase();
                    game.makeMove(playerMove);
                    break;

                case "terminate":
                    game.terminateGame();
                    break;

                case "exit":
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid command. Please enter start, move, terminate, or exit.");
            }
        }
    }
}
