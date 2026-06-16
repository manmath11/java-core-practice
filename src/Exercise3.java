import java.util.Scanner;
import java.util.Random;

class Game {
    private int number;        // The number to guess
    private int noOfGuesses;   // Number of guesses taken

    // Constructor to generate a random number between 1 and 100
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1; // 1 to 100
        this.noOfGuesses = 0;
    }

    // Method to take user input
    int takeUserInput() {
        System.out.print("Enter your guess: ");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        noOfGuesses++; // increment the number of guesses
        return guess;
    }

    // Method to check if the user's guess is correct
    boolean isCorrectNumber(int guess) {
        if (guess == number) {
            System.out.println("Congratulations! You guessed the correct number.");
            return true;
        } else if (guess < number) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }

    // Getter for number of guesses
    int getNoOfGuesses() {
        return noOfGuesses;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Game game = new Game();
        boolean correct = false;

        System.out.println("Welcome to Guess the Number Game!");

        while (!correct) {
            int userGuess = game.takeUserInput();
            correct = game.isCorrectNumber(userGuess);
        }

        System.out.println("You guessed the number in " + game.getNoOfGuesses() + " attempts.");
    }
}