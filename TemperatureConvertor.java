import java.util.Scanner;

public class TemperatureConvertor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double newTemp;

    System.out.println("Enter the temperature: ");
    double temp = sc.nextDouble();

    System.out.println("Convert to Celsius or Farenheit: ");
    String unit = sc.next().toUpperCase();

    if(unit.equals("C")){
      newTemp = (temp - 32) * (5.0/9.0);
      System.out.println("The temperature in Farenheit is: "+newTemp);
    } else{
      newTemp = (temp * 1.8) + 32;
      System.out.println("The temperature in celsius is: "+newTemp);
    }
  }
}
