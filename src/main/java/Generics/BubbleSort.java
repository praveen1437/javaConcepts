package Generics;

import java.util.*;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        Random random=new Random();
        Integer[] integers=random.ints(0, 1000).distinct().limit(999).boxed().collect(Collectors.toList()).toArray(new Integer[999]);
        Double[] doubles=random.doubles(0,101).distinct().limit(101).boxed().collect(Collectors.toList()).toArray(new Double[100]);
        System.out.println("integer Array before sorting");
        System.out.println(Arrays.toString(integers));
        bubbleSort(integers);
        System.out.println("integer Array after Sorting");
        System.out.println(Arrays.toString(integers));
        System.out.println("========================================");
        System.out.println("Double array before sorting");
        System.out.println(Arrays.toString(doubles));
        bubbleSort(doubles);
        System.out.println("Double array after sorting");
        System.out.println(Arrays.toString(doubles));

    }
   public static  <T extends Comparable<T>> void  bubbleSort(T list[]){
       for (int k=1;k<list.length;k++){
           for(int i=0;i<list.length-k;i++){
               if(list[i].compareTo(list[i+1])>0){
                   T temp=list[i];
                   list[i]=list[i+1];
                   list[i+1]=temp;
               }
           }
       }

    }

}
