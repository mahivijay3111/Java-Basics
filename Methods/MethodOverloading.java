public class MethodOverloading {
  public static void main(String[] args) {
    //method overloading= methods that share the same name, but different parameters

    add(1,2);
    add(1,2,3)
}
  static double add(double a, double b){
      return a+b;
  }
  static double add(double a, double b, double c){
    return a+b+c;
  }
}
