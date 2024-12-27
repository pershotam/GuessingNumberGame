# Guess the Number Game

This is a simple number guessing game implemented in Java. The computer randomly selects a number between 0 and 100, and the user has to guess the correct number. The game will provide feedback on whether the user's guess is smaller or larger than the randomly selected number, and will ask if the user wants to continue playing after each guess.

## Features:
- **Random Number Generation**: The computer generates a random number between 0 and 100.
- **User Interaction**: The user provides guesses and receives feedback on whether their guess is too high, too low, or correct.
- **Game Continuation**: After each guess, the user is asked if they want to continue playing. The game ends when the correct number is guessed or the user chooses to stop.
- **Input Validation**: The game ensures that user input is valid and prompts for re-entry if necessary.

## Game Flow:
1. **Start the Game**: The user is prompted to enter a guess between 0 and 100.
2. **Guess Feedback**: After each guess, the game provides feedback:
   - If the guess is smaller than the target number, it informs the user that their guess is too small.
   - If the guess is larger than the target number, it informs the user that their guess is too large.
3. **Continue or Stop**: After each guess, the user is asked if they want to continue playing or stop the game:
   - If they choose to continue, they are prompted to enter another guess.
   - If they choose to stop, the game ends and the number of guesses is displayed.
4. **End of Game**: Once the correct number is guessed, the game congratulates the user and ends, displaying the total number of guesses.

## How to Run:
1. Ensure you have Java installed on your computer.
2. Download or clone the project.
3. Compile and run the `Main` class.
4. Follow the on-screen instructions to play the game.

## Example of Gameplay:

