/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnorom6909
 */
public class Customer extends Person {

  
    private int customerID;
    private BankAccount[] accounts;
    
    public Customer(){
    
    System.out.println("Customer Created");
    accounts = new BankAccount[5];
    }
    
    public Customer(int customerId, String firstName, String lastName, char middleint){
    
    super(firstName, lastName, middleint);
    this.customerID = customerId;
    accounts = new BankAccount[5];
    
    }
    
     public Customer(int customerId, String firstName, String lastName, char middleint, BankAccount[] accounts){
    
    super(firstName, lastName, middleint);
    this.customerID = customerId;
    
    
    
    }
    
      public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    } 
    
      public int getCustomerID() {
        return customerID;
    }

   
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public void addAccountAt(int index, BankAccount b){
        this.accounts[index] = b;
    
    }
    
}
