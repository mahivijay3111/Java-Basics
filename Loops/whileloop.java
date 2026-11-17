import java.util.Scanner;

public class whileloop {
  public static void main(String[] args) {
    //to check if name is empty
    Scanner sc = new Scanner(System.in);
    String name = "";
    while(name.isEmpty()){
      System.out.println("Enter your name: ");
      name = sc.nextLine();
    }
    System.out.println("Hello "+name);
  }
}
