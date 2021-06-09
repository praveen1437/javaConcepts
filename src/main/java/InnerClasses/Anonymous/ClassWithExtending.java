package InnerClasses.Anonymous;

public class ClassWithExtending {
    public static void main(String[] args) {
        PopCorn p=new PopCorn();
        p.taste();
        PopCorn p1=new PopCorn(){
            public void taste(){
                System.out.println("spicy");
            }
        };
        p1.taste();
        PopCorn p2=new PopCorn(){
            public void taste(){
                System.out.println("sweety");
            }
        };
        p2.taste();

        System.out.println(p.getClass().getName());
        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());

    }

}
class PopCorn{
    public void taste(){
        System.out.println("salty");
    }
        }