public class VarArgs {
  public static void main(String[] args) {

    //sum of numbers
    
    System.out.println(add(1, 2));
    System.out.println(add(1, 2, 3));
    System.out.println(add(1, 2, 3, 4, 5));
  }
    static int add(int... numbers) {
      int sum = 0;

      for (int number : numbers) {
         sum += number;
      }

    return sum;
  }
}

