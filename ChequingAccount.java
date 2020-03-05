/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnorom6909
 */
public class  ChequingAccount extends BankAccount{

    private float overDraftPenalty;
    private float overDraftLimit;
    
    public ChequingAccount(){}

    public ChequingAccount(float overDraftPenalty, float overDraftLimit, int accouuntNo, float balance) {
        super(accouuntNo, balance);
        this.overDraftPenalty = overDraftPenalty;
        this.overDraftLimit = overDraftLimit;
    }
    
   
   
    public float getOverDraftPenalty() {
        return overDraftPenalty;
    }

   
    public void setOverDraftPenalty(float overDraftPenalty) {
        this.overDraftPenalty = overDraftPenalty;
    }

    
    public float getOverDraftLimit() {
        return overDraftLimit;
    }

   
    public void setOverDraftLimit(float overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    
    
    
    public boolean withdraw(float amount) {
        float balance = getBalance();
        if(amount > balance){
        
        if(amount + overDraftPenalty > balance + overDraftLimit){}
        return false;
        }
        else{
         setBalance(balance - amount);
        }
        return true;
    }
    
}
