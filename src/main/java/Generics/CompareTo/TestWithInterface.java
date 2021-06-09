package Generics.CompareTo;

/**
 * In this we are using another approach as methods given assignment E extends Comparable
 * comparable is an interface,only an interface can extend another interface
 * so We have taken interface A that extends Comparable
 * And a class B which implements interface A
 * in B class we have override CompareTo(as implement class must override interface methods)
 */
public class TestWithInterface {
    public static void main(String[] args) {
       A[] a1=getArray();
       A a2=GenericArrayUtils.max(a1);
       /*
       To access sub class variables we have to cast it to subclass,here subclass
       i just want to print the data in sub class to show maximum element is coming that's why i used cast here,otherwise don't need
        */
        B b=(B)a2;
        System.out.println(b.rank);
       int index=GenericArrayUtils.binarySearch(a1,new B(9));
       System.out.println(index);

    }
    public static A[] getArray(){
        A[] a=new A[5];
        a[0]=new B(5);
        a[1]=new B(2);
        a[2]=new B(9);
        a[3]=new B(4);
        a[4]=new B(1);
        return a;
    }
}
