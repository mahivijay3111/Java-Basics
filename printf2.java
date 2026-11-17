public class printf2 {
  public static void main(String[] args) {
    // %[flags][width][.precision][specifier-character]

    double price1 = 9.99;
    double price2 = 100.15;
    double price3 = -54.01;

    System.out.printf("%.1f\n", price1);
    System.out.printf("%+.1f\n",price2);
    System.out.printf("%(.1f\n",price3);
    System.out.printf("% .1f",price3);
  }
}
