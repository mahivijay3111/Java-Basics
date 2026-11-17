import java.util.Scanner;

public class mathconcepts2 {
  public static void main(String[] args) {
    //Hypotenuse c = Math.sqrt(s2+b2)

    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    double c;
    c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    System.out.println("The hypotenuse is= "+c);

  }
}
