package InnerClasses.Methodlevel;

public class Example1 {

         public void m1(){
             int x=10;

             class Inner {
                 public void m2() {
                     //x=15;
                     System.out.println("Inner.m2");
                     System.out.println(x);
                 }
             }
               Inner i=new Inner();
                 i.m2();
         }


    public static void main(String[] args) {
        Example1 e=new Example1();
        e.m1();
    }
     }


