import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    System.out.print("Enter your age:");
    int age = sc.nextInt();

    System.out.println("Your gpa:");
    double gpa = sc.nextDouble();

    System.out.println("Your gpa is:"+gpa);
    System.out.println("Your age is="+age);
    System.out.println("Hi "+name);

    sc.close();
  }
}
