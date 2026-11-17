import java.util.Scanner;

public class dowhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = 0;
    do{
      System.out.println("Your age can't be negative.");
      System.out.println("Enter your age: ");
      age = sc.nextInt();
    }while(age<0);
    System.out.println("You are "+age+ " years old");
  }
}
