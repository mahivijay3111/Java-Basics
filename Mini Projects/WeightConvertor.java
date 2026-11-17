import java.util.Scanner;

public class WeightConvertor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double weight;
    double newWeight;
    int choice;;

    System.out.println("Weight Convertor");
    System.out.println("1: Convert lbs to kgs");
    System.out.println("2: Convert kgs to lbs");

    System.out.print("Enter your choice: ");
    choice = sc.nextInt();
    if(choice == 1){
      System.out.print("Enter weight in lbs: ");
      weight = sc.nextDouble();
      newWeight = (weight * 0.45359237);
      System.out.println("The new weight is: "+newWeight);
    } else if(choice == 2){
      System.out.print("Enter weight in kgs: ");
      weight = sc.nextDouble();
      newWeight = (weight * 2.2046);
      System.out.println("The new weight is: "+newWeight);
    } else {
      System.out.println("The choice is not valid.");
    }
  }
}
