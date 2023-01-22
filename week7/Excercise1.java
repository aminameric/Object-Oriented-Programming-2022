package week7;

import java.util.HashMap;

public class Excercise1 {
    public static void main (String [] args){
        HashMap <String, String> people = new HashMap <>();

        people.put ("matti", "mage");
        people.put ("mikael",  "mixu");
        people.put ("arto", "arppa");

        System.err.println ("Matti: "+ people.get("adnan"));
    }
}
// just confirm and should be okay for last part of second