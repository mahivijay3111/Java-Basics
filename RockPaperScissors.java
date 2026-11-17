import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    String playAgain = "yes";

    do{
      String[] options = {"rock","paper","scissors"};
    System.out.print("Enter your move (rock, paper, scissors): ");
    String choice = sc.nextLine().toLowerCase();
    if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")){
      System.out.println("Invalid choice");
      continue;
    }

    int i = rand.nextInt(options.length);
    System.out.print("Computer choice: ");
    String guess = options[i];
    System.out.println(guess);

    if((choice.equals("rock") && guess.equals("scissors")) || 
    (choice.equals("paper") && guess.equals("rock")) || 
    (choice.equals("scissors") && guess.equals("paper"))){
      System.out.println("You win!");
    }else if(choice.equals(guess)){
      System.out.println("It is a tie!");
    }else{
      System.out.println("You lose!");
    }

    System.out.println("Play again?: ");
    playAgain = sc.nextLine().toLowerCase();
    }while(playAgain.equals("yes"));

    System.out.println("Thanks for playing!");
  }
}

