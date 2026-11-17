import java.util.Arrays;

public class ArraysExample {
  public static void main(String[] args) {
    //arrays= a collection of values of the same data type.
    String[] fruits = {"apple","orange","papaya"};
    fruits[0] = "pineapple";
    System.out.println(fruits[0]);

    System.out.println(fruits.length);

    for(int i = 0; i<fruits.length; i++){
      System.out.print(fruits[i]+" ");
    }

    for(String fruit: fruits){
      System.out.println(fruit);   //for each loop
    }

    //to sort an array
    Arrays.sort(fruits);   //alphabetically

    Arrays.fill(fruits, "pineapple");   //to fill the array with certain elements 
  }
}
