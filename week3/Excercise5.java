package week3;
import java.util.Scanner;
public class Excercise5 {
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        System.err.println ("Type the first word");
        String first = reader.nextLine ();

        System.err.println ("Type the second name");
        String second = reader.nextLine ();

        if (first.indexOf (second)>0){
            System.err.println ("The first word containts " + second);
        }
        else{
            System.err.println ("Does not contain");

        }
        }

    }

