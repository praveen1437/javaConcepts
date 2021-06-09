package Generics.CompareTo;

import Generics.CompareTo.GenericArrayUtils;
/**
 * In this test class we are using class that implements comparable interface
 */
import java.util.Arrays;

class TestWithClass {
    public static void main(String[] args) {
        D[] d=addElements();
        System.out.println(Arrays.toString(d));
        D d1= GenericArrayUtils.max(d);
        System.out.println(GenericArrayUtils.binarySearch(d,new D(7)));
        System.out.println(Arrays.toString(d));
    }
    public static D[] addElements(){
        D[] d=new D[5];
        d[0]=new D(2);
        d[1]=new D(1);
        d[2]=new D(9);
        d[3]=new D(8);
        d[4]=new D(7);

        return d;
    }
}
