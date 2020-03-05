/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author nnorom6909
 */
public class Comp258_2018 {
    
    
    public static void main (String[] args){
        
    
  BankAccount[] accounts = getBankAccount();
  Customer[] customers = getCustomers(accounts);
  Scanner input = new Scanner(System.in);
System.out.print("Enter Current Customer Pin #:");

int pin = input.nextInt();


Customer activeCustomer = getCustomerByPin(customers, pin);




        if(activeCustomer != null){
            System.out.print("Enter account #:");
            int accountId = input.nextInt();
            BankAccount[] activeAccounts = activeCustomer.getAccounts();
            BankAccount activeAccount = 
                    getBankAccountByAccountNo(activeAccounts, accountId);
            DisplayMenu();
            
            int menuOption = input.nextInt();
            doTransaction(menuOption, activeAccount);
        }
    }
    
    public static void doTransaction(int menuOption, BankAccount account){
    
    if(menuOption == 1)
     doDeposit(account);
     else if (menuOption == 2)
         doWithdraw(account);
     else if (menuOption == 3)
         doTransfer(account);
     else 
         System.out.println("Thanks, Come Again Soon");
                 
    
    
    
    }
    
    public static void doDeposit(BankAccount account){
    Scanner input = new Scanner(System.in);
    
    System.out.printf("Opening Balance: %.2f", account.getBalance());
    System.out.print("Deposit Amount :");
    float depositAmount = input.nextFloat();
    account.deposit(depositAmount);
    System.out.printf("Closing Balance: %.2f\n", account.getBalance());
    
     
    }
    
    public static void doWithdraw(BankAccount account){
     Scanner input = new Scanner(System.in);
    System.out.printf("Opening Balance: %.2f\n", account.getBalance());
    System.out.print("Withdraw Amount :");
    float withdrawamount = input.nextFloat();
    if(account.withdraw(withdrawamount)){
    System.out.println("Transaction Complete:");
    
    }else{
    
    System.out.println("Tansaction has Failed");
    
    };
    System.out.printf("Closing Balance: %.2f\n", account.getBalance());
    
    }
    public static void doTransfer(BankAccount account){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter account number to tranfer to : ");
       int accountNo = input.nextInt();
   
       BankAccount[] accounts = getBankAccount();
       
      BankAccount targetAccount = getBankAccountByAccountNo(accounts, accountNo);
      System.out.println("How Much do you want to transfer");
      float transferAmount = input.nextFloat();
      
      System.out.printf("Opening balance (source) : %.2f", account.getBalance());
      System.out.printf(" opening balance (target): %.2f", targetAccount.getBalance());
      
    if(account.transfer(targetAccount, transferAmount)){
            System.out.println("Transaction Successful");
            System.out.printf("Closing balance (source): %.2f", account.getBalance());
            System.out.printf("Closing balance (target): %.2f", targetAccount.getBalance());
        
        }
        else{
            System.out.println("Transaction Failed");
        }
    }
    
    public static void DisplayMenu(){
    
    System.out.println("Please Select Transaction");
    System.out.println("1 -- > Deposit");
    System.out.println("2 --> Withdraw");
    System.out.println(" 3 -- > Transfer");
    System.out.println(" 4 -- > Quit");
    
    };
    
    public static Customer getCustomerByPin(Customer[] customers, int pin){
    
    Customer c = null;
    
    for(int i = 0; i < customers.length; i++){
    
    if(pin == customers[i].getCustomerID()){
    
        c = customers[i];
    }
    }
    
    return c;
    
    
    }
    
        public static BankAccount getBankAccountByAccountNo(BankAccount[] accounts, int accountNumber){
    
        BankAccount b = null;
     
        for(int i = 0; i < accounts.length; i++){
         
        if(accounts[i] != null && accountNumber == accounts[i].getAccouuntNo()){
         
         b = accounts[i];
         }
     
     }
    
    return b;
    }
    
    public static Customer[] getCustomers(BankAccount[] accounts){
        
        Customer[] customers = new Customer[3];
        customers[0] = new Customer(1234,"Smith","Bob",'B');
        customers[0].addAccountAt(0, accounts[0]);
        customers[0].addAccountAt(1, accounts[3]);
        
        customers[1] = new Customer(1235,"Doe","Jane",'J');
        customers[1].addAccountAt(0, accounts[1]);
        
        customers[2] = new Customer(1236,"Smith","John",'C');
        customers[2].addAccountAt(0, accounts[2]);
        customers[2].addAccountAt(1, accounts[1]);
   
        return customers;
}
    public static BankAccount[] getBankAccount(){

     BankAccount[] accounts = new BankAccount[4];
     accounts[0] = new ChequingAccount(10,1000,1111,2000);
     accounts[1] = new ChequingAccount(10,1000,1112,1200);
     accounts[2] = new SavingsAccount(200,15,1114,800);
     accounts[3] = new SavingsAccount(100,5,1113,90);
     return accounts;

}
    
    
}

