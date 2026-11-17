public class Stringmethods {
  public static void main(String[] args) {
    String name = "Mahi Vijay";
    int length = name.length();
    char letter = name.charAt(0);
    int index = name.indexOf(" ");
    System.out.println(letter);
    System.out.println(length);
    System.out.println(index);

    if(name.contains(" ")) {
      System.out.println("Your name contains a space");
    }else {
      System.out.println("Your name doesn't contain a space.");
    }
  }
}


