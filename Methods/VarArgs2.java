public class VarArgs2 {
  public static void main(String[] args) {
    //to calculate average of numbers

    System.out.println(average(1,2,3));
    System.out.println(average(2,3,4,5,55,6,6));
  }
  static double average(double... numbers){
    double sum = 0;
    for(double number:numbers){
      sum+=number;
    }
    return sum/numbers.length;
  }
}
