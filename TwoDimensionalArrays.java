public class TwoDimensionalArrays {
  public static void main(String[] args) {
    String[] fruits = {"apple","orange","banana"};
    String[] vegetables = {"potato","onion","carrot"};
    String[] meats = {"chicken","pork","fish"};

    String[][] groceries = {fruits,vegetables,meats};

    groceries[0][0] = "pineapple";
    groceries[1][0] = "raddish";

    for(String[] foods : groceries){
      for(String food : foods){
        System.out.print(food+" ");
      }
      System.out.println();
    }
  }
}
