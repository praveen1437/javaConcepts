public class StaticVariableInheritance {

    static int count;
}
class A extends StaticVariableInheritance{
    public A() {
        count++;
    }
}
class B extends StaticVariableInheritance{
    public B() {
        count++;
    }
}
class Test{
    public static void main(String[] args) {
 A a=new A();
 B b=new B();
        System.out.println(A.count);
    }
}
