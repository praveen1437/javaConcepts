package InnerClasses.staticNested;

public class Example1 {
    int x=10;
    static int y=20;

    static class Nested{
        public void m1(){
            System.out.println("in static nested m1");
           // System.out.println(x);

            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Nested n= new Nested();
        n.m1();
    }
}
class Test{
    public static void main(String[] args) {
        Example1.Nested n=new Example1.Nested();
        n.m1();
    }
}
