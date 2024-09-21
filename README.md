# Rock-Paper-Scissors Game (Core Java)

This is a simple **Rock-Paper-Scissors** game implemented using **Core Java**. 
The game is played through the console where the user can start, make a move (rock, paper, or scissors), and terminate the game. 
The computer makes random moves, and the game determines the outcome.

## Features

- **Start Game**: Start a new game session.
- **Make Move**: The player can choose rock, paper, or scissors. The game then randomly selects a move for the computer and determines the winner.
- **Terminate Game**: End the current game session.
- **Exit Game**: Exit the application.

## Requirements

- **Java 8** or higher
- **IDE** (Optional): IntelliJ IDEA, Eclipse, or any other Java IDE

## Getting Started

## 1. Clone the Repository
....
## 2. Compile the Project
You can compile the project using the command line:

javac Main.java Game.java

## 3. Run the Project
After compiling, run the project using the following command:
java Main

**Game Instructions**
Start a Game: Type start to start a new game.
Make a Move: After starting the game, type move, and you'll be prompted to enter rock, paper, or scissors to make your move.
Terminate the Game: Type terminate to end the current game session.
Exit: Type exit to exit the game.

**Example Gameplay**

Enter a command: start, move, terminate, or exit.
**start**
Game started! You can now make your move.

Enter a command: start, move, terminate, or exit.
**move**
Enter your move (rock, paper, or scissors):
**rock**
Player chose rock, Computer chose scissors. You win!

Enter a command: start, move, terminate, or exit.
**terminate**
Game terminated.

Enter a command: start, move, terminate, or exit.
**exit**
Exiting the game. Goodbye!

## 4. Project Structure

src/
├── Game.java       # Game logic class
└── Main.java       # Main class to run the game

## 5. Future Enhancements
#ToDo
Add a scoring system to track the number of wins, losses, and ties.
Improve input validation and provide more detailed feedback for invalid inputs.
