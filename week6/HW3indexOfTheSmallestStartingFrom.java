package week6;

public class HW3indexOfTheSmallestStartingFrom {
    public static void main (String [] args){
        int [] values = {-1,6,9,8,12};
        System.out.println ("Smallest is " + indexOfSmallestStartingFrom(values, 1));
        System.out.println ("Smallest is " + indexOfSmallestStartingFrom(values, 2));
        System.out.println ("Smallest is " + indexOfSmallestStartingFrom(values, 4));
    }
    public static int indexOfSmallestStartingFrom (int [] array, int index){
        int smallest = array [index];
        int indexOfSmallest = index;

        for (int i = index+1; i<array.length; i++){
            if (array[i]<smallest){
                indexOfSmallest =1;
                smallest =array [i];
            }
        }
        return indexOfSmallest;

    }
    
}
