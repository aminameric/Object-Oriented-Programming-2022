package week6;

import java.util.Arrays;
import java.util.Scanner;

public class HW5BinarySearchMain {
    public static void main (String [] args){

        int [] array = {-3,2,3,4,7,8,12};
        Scanner reader = new Scanner (System.in);

        System.out.println ("Values of the array: " +Arrays.toString(array));
        System.out.println();

        System.out.println ("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        String searchedValues;
        boolean result = HW5BinarySearch.BinarySearch (array, Integer.parseInt(searchedValue), 0, array.length);
        System.out.println ("result " + result);
    }

    
}
