import java.util.Scanner;

public class ShoppingCartProblem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("What item would you like to buy? ");
    String item = sc.nextLine();

    System.out.print("What is the price for each? ");
    double price = sc.nextDouble();

    System.out.print("How many would you like? ");
    int quantity = sc.nextInt();

    System.out.println("You bought "+quantity+" "+item);
    System.out.println("Your total is= $"+quantity*price);
  }
}
