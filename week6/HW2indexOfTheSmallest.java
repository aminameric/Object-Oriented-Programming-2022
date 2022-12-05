package week6;

public class HW2indexOfTheSmallest {
    public static void main (String [] args){
        int [] values = {6,5,7,11};
        System.out.println ("Smallest is " + indexOfSmallest(values));
    }
    public static int indexOfSmallest (int [] array){
        int smallest=array [0];
        int index=0;
        for (int i=1;i<array.length; i++){
            if (array[i]<smallest){
                index=i;
                smallest=array [i];
            }
        }
        return index;
    }
    
}
