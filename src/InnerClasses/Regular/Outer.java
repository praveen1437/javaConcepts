package InnerClasses.Regular;

public class Outer {
    class Inner{
        public  void m1(){
            System.out.println("Inner.m1");
        }
    }

    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.m1();
    }
}
