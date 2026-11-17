import java.util.Scanner;

public class Enhancedswitch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String day = sc.next();
    switch(day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
      case "Saturday", "Sunday" -> System.out.println("It is a weekend");
      default -> System.out.println(day + "is not a day");
    }
  }
}
