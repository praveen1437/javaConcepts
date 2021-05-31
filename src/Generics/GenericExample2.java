package Generics;

import java.util.ArrayList;

public class GenericExample2 {
    public static void main(String[] args) {
        /**
         * because generics applicable at compile time
         * compiler only checks left side it found normal array list
         * so it allowed adding number to list
         */
        ArrayList al=new ArrayList<String>();
        al.add(5);

    }
    public static void m1(ArrayList<String> al){

    }
    /*public static void m1(ArrayList<Integer> al){

    }*/
}
