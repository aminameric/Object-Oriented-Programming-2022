package week5;

import java.util.ArrayList;

public class Team {
    
    private String name;
    private ArrayList <Player> players;
    private int maxSize;
    private int size;
    
    public Team (String name){
        this.name=name;
        this.maxSize=16;
        this.size=0;
        this.players = new ArrayList <Player>();
    }
    public void addPlayer (Player player){
        if (this.size ()< this.maxSize){
            this.players.add (player);
            this.size += 1;
        }
    }
    public void setMaxSize (int maxSize){
        this.maxSize=maxSize;
    }
    public int size (){
        return this.size;
    }
    public void printPlayers (){
        for (Player player : this.players) {
            System.err.println (player);
        }
    }
    public String getName (){
        return this.name;
    }
    public void setName (String name){
        this.name=name;
    }
    public int getGoals (){
        int totalGoals=0;
        for (int i = 0; i < players.size(); i++) {      //players are array list
            totalGoals +=(players.get(i)).getGoals();    // za prvi object get goals; 
        }                                                //kada hocemo elemetn iz array list koristimo get i stavimo "i"jer je to indeks
        return totalGoals;
    }
    
}
