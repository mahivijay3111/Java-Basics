import java.util.Scanner;

public class CompoundInterestCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double A;
    double P;
    double r;
    int n;
    int t;

    System.out.println("Enter the principal amount: ");
    P = sc.nextDouble();
    System.out.println("Enter the interest rate: ");
    r = sc.nextDouble()/100;
    System.out.println();
    System.out.println("Enter the times compounded per year: ");
    n = sc.nextInt();
    System.out.println("Enter time the money is invested or borrowed for: ");
    t = sc.nextInt();

    A = P*Math.pow(1+r/n , n*t);
    System.out.println("The amount after"+t+"is: $"+A);
  }
}
