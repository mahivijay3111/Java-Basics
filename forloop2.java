public class forloop2 {
  public static void main(String[] args) throws InterruptedException{
    //to simulate a countdown

    int start = 10;
    for(int i = start; i>0; i--){
      System.out.println(i);
      Thread.sleep(1000);
    }
    System.out.println("HAPPY NEW YEAR");
  }
}
