package andersen.anton.lesson_5;
import java.util.ArrayList;

class Fruit{
    protected float amoun;
    public Fruit(float amoun){
        this.amoun = amoun;
    }
    public void smena (Box b){
        b.obmen(amoun);
    }
    public void setAmoun(float amoun1){
        amoun+=amoun1;
        System.out.println(amoun);

    }
}

class Apple extends Fruit{
    private float weight;

    public Apple (float amoun){
        super(amoun);
    }
    public float getWeight() {
        weight=1.0f*amoun;
        System.out.println(weight);
        return weight;
    }
    public void simile (Box b){
        b.compare(weight);
    }
}

class Orange extends Fruit{
    private float weight;
    public Orange (float amoun){
        super(amoun);
    }

    public float getWeight() {
        weight=1.5f*amoun;
        System.out.println(weight);
        return weight;
    }

    public void simile (Box b){
        b.compare(weight);
    }
}

class Box{
    public float newbox;
    public Box(float newbox){
        this.newbox = newbox;
    }
    public boolean compare(float weight){
        if (weight==newbox) {
            System.out.println("true");
            return true;
        } else{
            System.out.println("false");
        return false;
        }
    }
    public void obmen (float oldbox){
        if (newbox==0) {
            newbox = oldbox;
            oldbox=0;
            System.out.println("В старой коробке " + oldbox);
            System.out.println("В новой коробке " + newbox);
        }else{
            System.out.println("В коробке уже есть что-то");
        }
    }
}

public class AppleAndOrange {
    public static void main (String[] args) {
        Apple boxaplle = new Apple(12.0f);
        Orange boxorange = new Orange(20.0f);
        ArrayList<Float> fruitbox = new ArrayList<Float>();
        boxorange.getWeight();
        boxaplle.getWeight();
        Box box1 = new Box(20.0f);
        boxorange.simile(box1);
        boxaplle.simile(box1);
        Box box2 = new Box(0.0f);
        Box box3 = new Box(0.0f);
        boxaplle.setAmoun(12);
        boxorange.setAmoun(12);
        boxaplle.smena(box3);
        boxorange.smena(box2);
        boxorange.smena(box2);
    }
}
