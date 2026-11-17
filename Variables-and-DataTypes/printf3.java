public class printf3 {
  public static void main(String[] args) {
    // %[flags][width][.precision][specifier-character]

    int id1 = 1;
    int id2 = 23;
    int id3 = 456;
    int id4 = 7890;

    System.out.printf("%05d\n",id1);
    System.out.printf("%05d\n",id2);
    System.out.printf("%05d\n",id3);
    System.out.printf("%05d",id4);
  }
}
