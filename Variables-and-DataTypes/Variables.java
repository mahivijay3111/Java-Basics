public class Variables {
  public static void main(String[] args) {
    int age = 19;
    System.out.println("Mahi's age is: "+age);

    double price = 19.99;
    System.out.println("$"+price);

    char symbol = '!';
    System.out.println(symbol);

    boolean isStudent = true;
    System.out.println(isStudent);
    if(isStudent==true) {
      System.out.println("You are a student");
    }else {
      System.out.println("You are not a student.");
    }

    String name = "Mahi";
    System.out.println(name);

    System.out.println("Your name is: "+name+" " + "and age is: "+age);
  }
}
