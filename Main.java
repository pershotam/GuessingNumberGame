import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("* * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                     *");
        System.out.println("*        Guess the Number Game        *");
        System.out.println("*                                     *");
        System.out.println("* * * * * * * * * * * * * * * * * * * *");

        System.out.println("Range (0-100)");
        System.out.println("Enter your guess:");
        int num = sc.nextInt();

        Game game1 = new Game();
        game1.setUserInput(num);

        if (game1.isCorrectNumber() == Boolean.FALSE) {
            System.out.println("Invalid Number!");
        }
        else {
            if (game1.getUserInput() == game1.getRandomNumber())
                System.out.println("Congratulations!\nYou guessed the number correctly in one attempt.");

            else
                System.out.println("Number of guesses: " + game1.guesses());
        }
    }
}
