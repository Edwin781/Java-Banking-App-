/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nnorom6909
 */
public class Person {

   
    private String firstname;
    private String lastname;
    private char middleInt; 
    
    public Person(String firstname, String lastname, char middleInt){
        this.firstname = firstname;
        this.lastname   = lastname;
        this.middleInt = middleInt;
    
    
    
    }
    
    public Person(){
System.out.println("Person Created");

}
    
    public String getFullName(){
    return String.format("%s, %s %c.", getLastname(),getFirstname(), getMiddleInt());
    }
    
    public String toString(){
        return getFullName();
    }
    
   public boolean equals(Object o){
       Person p = (Person)o;
       if(this.getFullName().equals(p.getFullName()))
           return true;
       else
           return false;
   
   }
     
    public String getFirstname() {
        return firstname;
    }

  
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

   
    public String getLastname() {
        return lastname;
    }

   
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    public char getMiddleInt() {
        return middleInt;
    }

   
    public void setMiddleInt(char middleInt) {
        this.middleInt = middleInt;
    }
    
}
