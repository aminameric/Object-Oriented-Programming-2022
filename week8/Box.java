package week8;

import java.util.ArrayList;

public class Box {
    private ArrayList<ToBeStored> things;
    private double maximumWeight;
    private double weight;

    public Box (double maximumWeight){
        this.things= new ArrayList<>();
        this.maximumWeight= maximumWeight;
    }
    public void add(ToBeStored thing){
        if ((this.totalWeight()+ thing.weight())>this.maximumWeight){
            System.out.println ("Box is full");
        }
        else{
            this.things.add(thing);
        }
    }
    public double totalWeight (){
        double total=0;
        for (ToBeStored toBeStored : things) {
            total+=toBeStored.weight();
        }
        return total;
    }
    public String toString(){
        return "Number of things" + this.things.size() + "total weight "+ this.totalWeight();
    }
    public double weight (){
        return this.weight;
    }
}
