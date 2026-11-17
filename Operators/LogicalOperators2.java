import java.util.Scanner;

public class LogicalOperators2 {
  public static void main(String[] args) {
    //to validate a username when somebody tries to set a username

    Scanner sc = new Scanner(System.in);

    String un = sc.nextLine();

    if(un.length() < 4 || un.length() > 12){
      System.out.println("Username must be between 4-12 charcaters.");
    }else if(un.contains(" ") || un.contains("_")){
      System.out.println("Username must not contain spaces or underscores.");
    }else {
      System.out.println("Welcome "+un);
    }
  }
}
