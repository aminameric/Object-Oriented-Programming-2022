package week3;
import java.util.Scanner;
public class Exercise8 {
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);
        System.err.println ("please enter the word");
        String word = reader.nextLine ();

        String reverse = "";

        for (int i=(word.length () -1); i>=0; i--){
            reverse = reverse + word.charAt (i);
        }
        if (reverse.equals (word)){
            System.err.println ("it is a palindrom");
        }
        else{
            System.err.println ("it is NOT a palindrom");
        }
    }
    
}
