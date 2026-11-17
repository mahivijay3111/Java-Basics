import java.util.Scanner;

public class NestedLoops2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int m = sc.nextInt();
    System.out.print("Enter the number of columns: ");
    int n = sc.nextInt();
    System.out.print("Enter the symbol to use: ");
    char ch = sc.next().trim().charAt(0);

    for(int i = 1; i<m; i++){
      for(int j = 1; j<n; j++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
