package Generics.CompareTo;

import java.util.Arrays;
import java.util.Collections;


public class GenericArrayUtils {
    /**
     * We have used predefined sort method to sort array, if we want we can write our own logic like,
     * bubble sort,quick sort,insertion sort,selection sort and etc..
     * so the last element in the array is the max element of all
     * We just return last element after sorting the array
     *
     * @param list
     * @param <E>
     * @return E
     */
    public static <E extends Comparable<E>> E max(E[] list) {
        sortTheArray(list);
        return list[list.length - 1];
    }

    /**
     * It sort the array based on compareTo method we provided in Element class(here class D)
     * Our compareTo method logic gives ascending order
     * @param list
     * @param <E>
     */
    private static <E extends Comparable<E>> void sortTheArray(E[] list) {
        Arrays.sort(list);
    }

    /**
     * For binary search to work elements must be sorted otherwise binarySearch won't work
     * We pass sorted array into binarySearch method and object we need to find in that array
     * based on compareTo method it returns the index of matching object in array
     * @param list
     * @param key
     * @param <E>
     * @return int
     */
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        //First sort the array
        sortTheArray(list);
        //this is predefined
        return Arrays.binarySearch(list, key);

        //this is our logic no need to use this logic because we already have predefined function for this
        /*
        int low = 0;
        int high = list.length - 1;
        while (low<high){
            int mid=(low+high)/2;
            if(list[mid].compareTo(key)==0){
                return mid;
            }
            else if(list[mid].compareTo(key)>0){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }*/
    }
}



