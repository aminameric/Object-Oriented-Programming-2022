package week6;

public class HW5BinarySearch {
    private static final boolean TRUE = false;
    private static final boolean FALSE = false;

    public static boolean BinarySearch (int [] array, int searchedValue, int first, int last){
        if (last>first){
            int mid = first + (last-first)/2;

            if (array [mid] == searchedValue){
                return TRUE;
            }
            if (array[mid]>searchedValue){
                return BinarySearch (array, searchedValue, first, mid-1);
            }
            else{
                return BinarySearch (array, searchedValue, mid+1, last);
            }
        }
        return FALSE;
    }
    
}
