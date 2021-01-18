import java.util.Scanner;
class DriverBank
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    Bank a1=new Bank("Kyle",786753.89);
    System.out.println(a1);
    System.out.println("Choose any option");
    System.out.println("1. Credit");
    System.out.println("2. Debit");
    int choice=in.nextInt();
    int amount=0;
    double uamount=a1.balance;
    if(choice==1)
    {
      System.out.println("Enter the amount to credit");
      amount=in.nextInt();
      uamount=a1.credit(amount);
      
    }
     else if(choice==2)
    {
      System.out.println("Enter the amount to withdraw");
      amount=in.nextInt();
      uamount=a1.debit(amount);
      
    }
     else
     {
       System.out.println("Kindly enter valid value");
     }
     System.out.println("Current balance: "+uamount);
    
    
  }
}