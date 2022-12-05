package week6;

public class HW1SmallestValue {
    public static void main (String [] args){
        int [] values = {6,5,7,11};
        System.out.println ("Smallest is " + smallest(values));
    }
    public static int smallest (int [] array){
        int smallest=array [0];
        for (int i=1; i<array.length; i++){
            if (array[i]<smallest){
                smallest=array[i];
            }
        }
        return smallest;
    }
    
}
