package andersen.anton.lesson_4;

class Cat {
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
    public void satiety (Plate p) {
        System.out.print(name+" ");
        p.fill(appetite);
    }
}

class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int amount) {
        if (amount<=food){
        food -= amount;
        System.out.println("сытый");
        } else {
            System.out.println("не сможет есть, ему слишком мало");
        }
    }
    public boolean fill (int amount) {
        if (amount<=food){
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }
    public void setFood(int newfood){
        System.out.println("Добавим в миску " + newfood);
        food += newfood;
    }

}


public class CatPlate {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 50);
        Plate plate = new Plate(180);
        plate.info();
        cat.satiety(plate);
        cat.eat(plate);
        plate.info();
        plate.setFood(120);
        plate.info();
        Cat[] caty= new Cat[5];
        caty[0] = new Cat("Loki", 85);
        caty[1] = new Cat("Borsuk", 70);
        caty[2] = new Cat("Cheming", 110);
        caty[3] = new Cat("Kirill", 60);
        caty[4] = new Cat("Tiger", 35);
        for (int i=0; i<5; i++){
            caty[i].satiety(plate);
            caty[i].eat(plate);
            plate.info();

        }
    }
}
