package Generics;

public class CustomGenericClass<T extends Student> {
    T student;
    CustomGenericClass(T student){
        this.student=student;
    }
    public T getStudent(){
        return this.student;
    }

    public static void main(String[] args) {
        Student s=new Student();
       // CustomGenericClass<Integer> customGenericClass=new CustomGenericClass<Integer>();
        CustomGenericClass<Student> customGenericClass=new CustomGenericClass(new Student());
    }
}
class customgenric<T extends Number,Q extends Student>{

}