/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnorom6909
 */
public class SavingsAccount extends BankAccount{

   
    private float minBalance;
    private int withdrawCount;

    public SavingsAccount(float minBalance, int withdrawCount) {
        this.minBalance = minBalance;
        this.withdrawCount = withdrawCount;
    }

    public SavingsAccount(float minBalance, int withdrawCount, int accouuntNo, float balance) {
        super(accouuntNo, balance);
        this.minBalance = minBalance;
        this.withdrawCount = withdrawCount;
    }
    
    //shared by all instances of class
    private static final float ACTIVITY_PENALITY = 5f; //can never change
    private static float ACTIVITY_LIMIT = 10; // could change (not final)
    
   public boolean withdraw(float amount){
       
       if(withdrawCount >= ACTIVITY_LIMIT ){
       if(getBalance() - (amount + ACTIVITY_PENALITY)  <  minBalance){
       if(getBalance() <= amount + ACTIVITY_PENALITY )
        return false;
       else{
        setBalance(getBalance() - amount + ACTIVITY_PENALITY);
       
       }
       }
       }else{
        setBalance(getBalance() - amount);
       
       }
    return true;
   }
   
     public float getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(float minBalance) {
        this.minBalance = minBalance;
    }

    public int getWithdrawCount() {
        return withdrawCount;
    }

    public void setWithdrawCount(int withdrawCount) {
        this.withdrawCount = withdrawCount;
    }
}
