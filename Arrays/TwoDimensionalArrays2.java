public class TwoDimensionalArrays2 {
  public static void main(String[] args) {
    //representing a telephone pad

    char[][] telephonepad = {{'1','2','3'},
                            {'4','5','6'},
                            {'7','8','9'},
                            {'*','0','#'}
    };

    for(char[] row : telephonepad){
      for(char number : row){
        System.out.print(number+" ");
      }
      System.out.println();
    }
  }
}
