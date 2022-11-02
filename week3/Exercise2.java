package week3;
import java.util.Scanner;
public class Exercise2 {
    public static void main (String [] args){
        Scanner reader = new Scanner (System.in);

        System.err.println ("please enter the name");

        String name = reader.nextLine ();

        System.err.println ("Legth "+ name.length());

}
}