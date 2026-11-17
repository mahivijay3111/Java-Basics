import java.util.Scanner;

public class mathconcepts3 {
  public static void main(String[] args) {
    //circumference = 2*Math.PI*radius
    //area = Math.PI*Math.pow(radius,2)
    //volume = (4.0/3.0)*Math.PI*Math.pow(radius,3)

    Scanner sc = new Scanner(System.in);

    double radius;
    radius = sc.nextDouble();
    System.out.println("The radius of the circle is: "+radius);

    double circum = 2 * Math.PI * radius;
    System.out.println("The circumference of the circle is: "+circum);

    double ar = Math.PI * Math.pow(radius,2);
    System.out.println("The area of a circle is: "+ar);

    double vol = (4.0/3.0) * Math.PI * Math.pow(radius,3);
    System.out.println("The volume of circle is: "+vol);
  }
}
