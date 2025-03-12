import java.util.Scanner;
class ATM_Machine
{
 double balance;   
 ATM_Machine(double initial_balance)
 {
   balance = initial_balance;
 }
 void Withdraw(double amount) 
 {
  if(amount>balance)
  {
   System.out.println("Insufficient Balance!");
  }
  else
  {
   if(amount<=0)
   {
    System.out.println("Invalid Withdrawl amount");
   }
   else 
   {
     balance-=amount;
     System.out.println("Withdrawl Successful!\nCurrent bank balance: "+balance);
   } 
  }
 }
 void Deposit(double amount)
 {
  if(amount>0)
  {
   balance += amount;
   System.out.println("Deposit Successful\nCurrent bank balance: "+balance);
  }
  else{
  System.out.println("Invalid amount");
  }
 }
void CheckBalance()
 {
  System.out.println("Total Available balance: "+balance);
 }

 public static void main(String[]args) 
 {
  Scanner input = new Scanner(System.in);
  ATM_Machine bank = new ATM_Machine(5000.0);
  System.out.println("Press 1 for Withdrawl");
  System.out.println("Press 2 for Deposit");
  System.out.println("Press 3 for Check Balance");
  System.out.println("Press 4 for Exit");
  while(true){    
  System.out.println("Enter your choice:");
  int choice= input.nextInt();
  switch(choice) 
  {
   case 1:
        System.out.println("Enter Withdrawl Amount:");
        double withdrawAmount = input.nextDouble();
        bank.Withdraw(withdrawAmount);
        break;    
   case 2:
        System.out.println("Enter Deposal Amount:");
        double DeposalAmount = input.nextDouble(); 
        bank.Deposit(DeposalAmount);
        break;    
   case 3:
        bank.CheckBalance();
        break;    
   case 4:
        System.out.println("Thanks for using ATM");
        break;    
   default:
        System.out.println("Invalid choice");   
        break;
  }
 System.out.println("Do you want to continue?yes/no: ");
 String ans = input.next();
  if(ans.equals("no")){
      System.out.println("Thanks for using ATM");
      break;
 }     
 }     
}
}
