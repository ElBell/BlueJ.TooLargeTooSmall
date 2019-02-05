import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuessingGame
{
    /**
     * Constructor for objects of class Main
     */
    public GuessingGame()
    {
      int attempts = 0;
      int random = (int)(Math.random() * (10 - 1) + 1);
      int guess; 
      int lastGuess = 99;
      Scanner guessInput = new Scanner(System.in);
      System.out.println("Let's play a game! Guess a number between 1 and 10");
      guess = guessInput.nextInt();
      while (guess != random) {
          if (lastGuess == guess) {
              System.out.println("You just guessed that, silly");
              guess = guessInput.nextInt();
            } else {
              if (guess > random) {
                  System.out.println(guess + " is too high");
              } else {
                  System.out.println(guess + " is too low");
              }
              System.out.println("Guess again!");
              lastGuess = guess;
              guess = guessInput.nextInt();
              attempts = attempts + 1;
         } 
        } 
     System.out.println(guess + " is correct! You were wrong " + attempts + " times");
    }
}
