import java.util.Scanner;

public class question3 {
  public static void main(String[] args) {
    //Calculating area of a rectangle
    double width;
    double height;
    double area;

    Scanner sc = new Scanner(System.in);
    System.out.println("The width is:");
    width = sc.nextDouble();
    System.out.println("The height is:");
    height = sc.nextDouble();
    System.out.println("The area of a rectangle is:" + (height*width));

    sc.close();
  }
}
