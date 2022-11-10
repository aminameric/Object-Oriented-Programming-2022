package week4;

public class Excercise3 {
    private double balance;
    private double amount;

    public Excercise3 (double balanceAtStart){
        this.balance=balanceAtStart;

    }
    public String toString() {
        return "The card has " + this.balance + " euros";
      }
    public void payEconomical (){
        if (this.balance <2.5){
            System.out.println ("Payment rejected");
        }
        else{
            this.balance -=2.5;
        }

    }
    public void payGourmet() {
        if(this.balance < 4.0) {
          System.out.println("Payment rejected!");
        } else {
          this.balance -= 4.0;
        }
      }
  
      public void loadMoney(double amount) {
        if(amount >= 0) {
        if(this.balance + amount > 150.0) {
          this.balance = 150.0;
        } else {
          this.balance += amount;
        }
      }
    }

   
}
