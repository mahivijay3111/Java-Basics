public class breakandcontinue {
  public static void main(String[] args) {
    //break= break out of a loop
    //continue= skip current iteration of a loop

    for(int i = 0; i<10; i++){
      if(i==5){
        break;    //continue
      }
      System.out.println(i+" ");
    }
  }
}
