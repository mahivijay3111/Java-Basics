public class Methods {
  public static void main(String[] args) {
    happyBirthday("Mahi", 19);
    double result = square(3);
    System.out.println(result);
    String fullName = getFullName("Mahi","Vijay");
    System.out.println(fullName);
    int age = 21;
    if(ageCheck(age)){
      System.out.println("You may sign up!");
    }else{
      System.out.println("You must be 18 to sign up");
    }
  }
  static void happyBirthday(String name, int age){
    System.out.println("Happy Birthday to you "+name);
    System.out.println("Happy Birthday dear you!");
    System.out.println("You are "+age+" years old!");
    System.out.println("Happy Birthday to you!\n");
  }

  static double square(double number){
    return number * number;
  }

  static String getFullName(String first, String last){
    return first+" "+last;
  }

  static boolean ageCheck(int age){
    if(age>=18){
      return true;
    }else{
      return false;
    }
  }

}
