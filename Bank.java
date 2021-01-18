public class Bank
{
 //data members
  String accountHolder;
  double balance;
  
  //constructor
  public Bank(String n,double b)
  {
    accountHolder=n;
    balance=b;
   }
  
  double credit(int deposit)
  {
    balance=balance+deposit;
    return balance;
  }
  double debit(int withdraw)
  {
    balance=balance-withdraw;
    return balance;
  }
  public String toString()
  {
    String s1="Account Details \n Holder: "+accountHolder+"\nCurrent Balance: "+balance;
    return s1;
  }  
}