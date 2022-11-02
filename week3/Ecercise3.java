package week3;
import java.util.Scanner;
public class Ecercise3 {
    public static void main(String [] args){
        Scanner reader = new Scanner (System.in);

        System.err.println ("enter the name");

        String name =reader.nextLine ();
        
        for (int i=0; i<name.length (); i++){
            System.err.println ((i+1) + " charactar " + name.charAt (i));
        }
    }
    
}
