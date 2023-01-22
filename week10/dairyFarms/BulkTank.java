package week10.dairyFarms;

public class BulkTank {
    private double capacity = 2000;
    private double volume = 2000;
    private double amount = 0;

    public BulkTank (){

    }
    public BulkTank(double capacity){

    }
    public double getCapacity(){
        return this.capacity;

    }
    public double getVolume(){
        return this.volume;

    }
    public double howMuchFreeSpace(){
        return this.capacity-this.amount;

    }
    public void addToTank(double amount){
        if (this.capacity>this.amount+amount){
            this.amount= this.amount+amount;
        }
        else{
            System.out.println ("no enough space");
        }
    }
    public double getFromTank(double amount){
        if (amount>this.amount){
            this.amount -= amount;
            return amount;
        }
        else{
            this.amount = 0;
            return this.amount;
        }
    }
}
