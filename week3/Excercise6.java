package week3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections; 

public class Excercise6 {
    
    public static void main (String [] args){
        ArrayList<String>words = new ArrayList <String> ();
        Scanner reader = new Scanner (System.in);

        while (true){
            System.err.println ("enter the word");
            String enter=reader.nextLine ();
            if (words.contains(enter)){
                System.out.println ("You entered the word " + enter + "twice");
                break;
            }
            else{
            words.add (enter);
            }
        }
        Collections.sort (words);
        System.err.println ("The array in alpahebtic order is ");
        System.err.println (words);
    }   
}
