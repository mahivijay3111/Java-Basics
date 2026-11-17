import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    int n2 = sc.nextInt();
    System.out.println("Enter an operator: ");
    char op = sc.next().trim().charAt(0);

    switch(op) {
      case '+'-> System.out.println("The sum is: "+ (n1+n2));
      case '-'-> System.out.println("The difference is: " + (n1-n2));
      case '*'-> System.out.println("The product is: " + (n1*n2));
      case '/'-> System.out.println("The quotient is: " + (n1/n2));
    }
  }
}
