import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    int guess = 0;
    int number = rand.nextInt(100)+1;
    System.out.println("Guess a number between 1 and 100.");
    while(guess!=number){
      System.out.println("Enter your guess: ");
      guess = sc.nextInt();
      if(guess>number){
        System.out.println("Too high! Try again.");
      }else if(guess<number){
        System.out.println("Too low! Try again.");
      }else {
        System.out.println("Congrats!");
      }
    }
  }
}
