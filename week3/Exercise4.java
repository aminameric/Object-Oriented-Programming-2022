package week3;
import java.util.Scanner;
public class Exercise4 {
    public static void main (String [] args){
        System.err.println ("enter your name");
        Scanner reader = new Scanner (System.in);
        String name= reader.nextLine ();

        String reverse = "";

        for (int i=(name.length () -1); i>=0; i--){
            reverse = reverse + name.charAt (i);
        }
        System.err.println ("reverse is: " + reverse);
    }
    
}
