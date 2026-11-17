import java.util.Scanner;

public class BankingProgram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Enter an amount to be deposited: ");
    double amount = sc.nextDouble();

    System.out.println("*****************");
    System.out.println("BANKING PROGRAM");
    System.out.println("*****************");

    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");

    System.out.println("*****************");

    System.out.println("Enter your choice: ");
    int choice = sc.nextInt();

    if(choice==1){
      showBalance(amount);
    }else if(choice==2){
      System.out.println("Enter the amount to deposit in your bank account: ");
      double deposit = sc.nextDouble();
      amount = amount+deposit;
      showBalance(amount);
    }else if(choice==3){
      System.out.println("Enter the amount to withdraw: ");
      double withdraw = sc.nextDouble();
      amount = amount-withdraw;
      showBalance(amount);
    }else if(choice==4){
      System.out.println("The program exits.");
    }
  }
  static void showBalance(double amount){
    System.out.println("The final amount is: "+amount);
  }
}
