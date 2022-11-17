package week5;

public class Player {
    private String name;
    private int goal;

    public Player (String name, int goal){
        this.name=name;
        this.goal=goal;

    }
    public Player (String name){
        this (name,0);
    }
    public String getName(){
        return this.name;
    }
    public void setName (String name){
        this.name=name;
    }
    public int getGoals (){
        return this.goal;
    }
    public void setGoals (int goal){
        this.goal=goal;
    }
    public String toString (){
        return this.name + " , goals " + this.goal;
    }
}
