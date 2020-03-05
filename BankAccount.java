/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnorom6909
 */
public abstract class BankAccount {

    private int accouuntNo;
    private float balance;
    
    public BankAccount(){}

    public BankAccount(int accouuntNo, float balance) {
        this.accouuntNo = accouuntNo;
        this.balance = balance;
    }
    
    public void deposit(float amount){
        setBalance(getBalance() + amount);
    }
   public int getAccouuntNo() {
        return accouuntNo;
    }

    public void setAccouuntNo(int accouuntNo) {
        this.accouuntNo = accouuntNo;
    }  
    
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
   public abstract boolean withdraw(float amount);
   
   public boolean transfer(BankAccount account, float amount){
   boolean success=false;
        if( withdraw(amount )){
            account.deposit(amount);
            success = true;
        }
        return success;
   }
    
}
