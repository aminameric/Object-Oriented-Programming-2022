package week4;
import java.util.Random;
public class Excercise2 {
    

    private Random random;
    private int numberOfSides;

    public Excercise2 (int numberOfSides){
        this.numberOfSides = numberOfSides;
        random= new Random();
    }

    public int roll() {
        return random.nextInt (1, numberOfSides+1);
    }
}
   

