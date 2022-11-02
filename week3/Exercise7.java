package week3; 
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
    public static ArrayList<Integer> lengths (ArrayList<String> list){
        ArrayList <Integer> listLength = new ArrayList<> ();

        for (String name: list){
            listLength.add (name.length ());
        }
        return listLength;

    }
    public static void main (String [] args){
        ArrayList<String>list = new ArrayList <> ();
        Scanner reader= new Scanner (System.in);

        list.add ("Hallo");
        list.add ("Moi");
        list.add ("Benvenuto!");
        list.add ("badger badger badger badger");

        ArrayList <Integer> listInteger =lengths (list);

        System.err.println ("The length of the string" + listInteger);
    }   
}
