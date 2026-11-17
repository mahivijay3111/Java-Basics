public class Ternaryoperator {
  public static void main(String[] args) {
    //variable = (condition) ? ifTrue: ifFalse;

    int score = 70;
    String passOrFail = (score>=60) ? "PASS":"FAIL";
    System.out.println(passOrFail);
  }
}
