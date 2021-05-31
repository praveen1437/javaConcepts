package Generics;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class WildCard {
    public void m1(ArrayList<?> arrayList){
        //  arrayList.add(5);
    }
    public void m2(ArrayList<? extends WildCard> wildCards){
       // wildCards.add(wildCards);

    }
    public void m3(ArrayList<? super WildCard> objects){
        objects.add(new WildCard());
    }
     public void m4(ArrayList<? super Cards> objects){
       // objects.add(new WildCard());
        objects.add(new Card1());
       // objects.add(new CardsSuper1());

     }
}
interface Cards extends CardsSuper{

}
class Card1 extends WildCard implements Cards{

}
interface CardsSuper{

}
class CardsSuper1 implements CardsSuper{

}