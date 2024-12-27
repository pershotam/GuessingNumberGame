import java.util.Random;
import java.util.Scanner;

public class Game {
    int userInput;
    int randomNumber;
    Scanner sc;

    Game() {
        Random random = new Random();
        randomNumber = random.nextInt(100);
        sc = new Scanner(System.in);
    }

    void setUserInput(int n) {
        userInput = n;
    }

    public int getUserInput() {
        return userInput;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    Boolean isCorrectNumber() {
        if (userInput >= 0 && userInput <= 100)
            return Boolean.TRUE;

        else
            return Boolean.FALSE;
    }

    int guesses() {
        int noOfGuesses = 0;
        String choice = "";

        while (userInput < randomNumber || userInput == randomNumber || userInput >= randomNumber) {
            noOfGuesses += 1;

            if (userInput == randomNumber){
                System.out.println("Congratulations!\nYou guessed the number correctly.");
                break;
            }

            else if (userInput < randomNumber) {
                System.out.println("Entered guess is smaller. Please try again:");
                System.out.println("Do you want to continue? (y/n)");
                choice = sc.next();
                System.out.println();
            }
            else {
                System.out.println("Entered guess is larger. Please try again:");
                System.out.println("Do you want to continue? (y/n)");
                choice = sc.next();
            }

            if (choice.trim().equals("n") || choice.trim().equals("N")) {
                System.out.println("Game Ended!");
                return noOfGuesses;
            }
            else if (choice.trim().equals("y") || choice.trim().equals("Y")) {
                System.out.println("Enter your guess: ");
                userInput = sc.nextInt();
            }
            else {
                System.out.println("Invalid Input");
                System.out.println("Do you want to continue? (y/n)");
                choice = sc.next();
                System.out.println("Enter your guess: ");
                userInput = sc.nextInt();
            }
        }
        return noOfGuesses;
    }
}
