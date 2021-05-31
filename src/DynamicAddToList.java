import java.util.ArrayList;
import java.util.List;

public class DynamicAddToList {
    public static void main(String[] args) {
        List<LightBulb> lightBulbs=new ArrayList<>();
        for(int i=0;i<5;i++){
            LightBulb lightBulb=new LightBulb(i);
            lightBulbs.add(lightBulb);
        }
        for (LightBulb lightBulb: lightBulbs
             ) {
            System.out.println(lightBulb);
        }
    }
}
class LightBulb{
    int number;

    public LightBulb(int number) {
        this.number = number;
    }
}