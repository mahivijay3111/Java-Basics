import java.util.Scanner;

public class ArraysExample2 {
  public static void main(String[] args) {

    //user entering the elements into an array
    
    Scanner sc = new Scanner(System.in);
    String[] fruits;
    int size;

    System.out.println("What # of fruits do you want?: ");
    size = sc.nextInt();

    fruits = new String[size];

    for(int i = 0; i<fruits.length; i++){
      System.out.print("Enter a fruit: ");
      fruits[i]=sc.next();
    }
    for(String fruit:fruits){
      System.out.println(fruit);
    }
  }
}
